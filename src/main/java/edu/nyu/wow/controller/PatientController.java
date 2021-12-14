package edu.nyu.wow.controller;

import edu.nyu.wow.dao.bo.EmergencyContactBo;
import edu.nyu.wow.dao.bo.PatientBo;
import edu.nyu.wow.dao.dto.EmergencyContactDto;
import edu.nyu.wow.dao.dto.HospitalDto;
import edu.nyu.wow.dao.dto.PatientDto;
import edu.nyu.wow.dao.ibo.EmergencyContactIbo;
import edu.nyu.wow.dao.ibo.PatientIbo;
import edu.nyu.wow.dao.vo.EmergencyContactVo;
import edu.nyu.wow.dao.vo.PatientVo;
import edu.nyu.wow.entity.EmergencyContact;
import edu.nyu.wow.entity.User;
import edu.nyu.wow.enums.ResponseStatus;
import edu.nyu.wow.meta.RequestContext;
import edu.nyu.wow.meta.SimpleResponse;
import edu.nyu.wow.service.IAccountService;
import edu.nyu.wow.service.IEmergencyContactService;
import edu.nyu.wow.service.IPatientService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

/**
 * @Author: sw3455
 * @Date: 2021/12/14
 * @Email: sw3455@nyu.edu
 */
@RestController
@RequestMapping("/patient")
public class PatientController {

    @Autowired
    ModelMapper modelMapper;

    @Autowired
    IPatientService patientService;

    @Autowired
    IAccountService accountService;

    @Autowired
    IEmergencyContactService emergencyContactService;

    @PostMapping("/addProfile")
    public SimpleResponse<PatientDto> addProfile(@RequestBody PatientVo vo) {
        User user = RequestContext.getCurrentUser();
        // Patient profile existed
        if (user.getUserId() != 0) {
            return new SimpleResponse<>(null, ResponseStatus.ERROR);
        }
        PatientIbo ibo = modelMapper.map(vo, PatientIbo.class);
        PatientBo bo = patientService.addPatient(ibo).getData();
        // add to user
        user.setUserId(bo.getPatientId());
        accountService.updateUserId(user);
        PatientDto dto = modelMapper.map(bo, PatientDto.class) ;
        return new SimpleResponse<>(dto);
    }

    @PostMapping("/updateProfile")
    public SimpleResponse<PatientDto> updateProfile(@RequestBody PatientVo vo) {
        User user = RequestContext.getCurrentUser();
        // Patient profile not existed
        if (user.getUserId() == 0) {
            return new SimpleResponse<>(null, ResponseStatus.ERROR);
        }
        PatientIbo ibo = modelMapper.map(vo, PatientIbo.class);
        PatientDto dto = modelMapper.map(patientService.updatePatient(ibo).getData(), PatientDto.class) ;
        return new SimpleResponse<>(dto);
    }

    @GetMapping("/{patient}")
    public SimpleResponse<PatientDto> patientDetail(@PathVariable("patient") Long patientId) {
        PatientDto patientDto = modelMapper.map(patientService.patientDetail(patientId).getData(), PatientDto.class);
        return new SimpleResponse<>(patientDto);
    }

    @GetMapping("/myPatientProfile")
    public SimpleResponse<PatientDto> myPatientProfile() {
        User user = RequestContext.getCurrentUser();
        PatientDto patientDto = modelMapper.map(patientService.patientDetail(user.getUserId()).getData(), PatientDto.class);
        return new SimpleResponse<>(patientDto);
    }

    @PostMapping("/addMyEmergencyContact")
    public SimpleResponse<EmergencyContactDto> addMyEmergencyContact(@RequestBody EmergencyContactVo vo) {
        User user = RequestContext.getCurrentUser();
        EmergencyContactIbo ibo = modelMapper.map(vo, EmergencyContactIbo.class);
        ibo.setPatientId(user.getUserId());
        EmergencyContactDto emergencyContactDto = modelMapper.map(emergencyContactService.add(ibo), EmergencyContactDto.class);
        return new SimpleResponse<>(emergencyContactDto);
    }

    @GetMapping("/getMyEmergencyContact")
    public SimpleResponse<List<EmergencyContactDto>> getMyEmergencyContact() {
        User user = RequestContext.getCurrentUser();
        List<EmergencyContactBo> bos = emergencyContactService.list(user.getUserId());
        List<EmergencyContactDto> dtos = modelMapper.map(bos, new TypeToken<List<EmergencyContactDto>>(){}.getType());
        return new SimpleResponse<>(dtos);
    }

    @GetMapping("/getEmergencyContact/{patient}")
    public SimpleResponse<List<EmergencyContactDto>> getEmergencyContact(@PathVariable("patient") Long patientId) {
        List<EmergencyContactBo> bos = emergencyContactService.list(patientId);
        List<EmergencyContactDto> dtos = modelMapper.map(bos, new TypeToken<List<EmergencyContactDto>>(){}.getType());
        return new SimpleResponse<>(dtos);
    }
}
