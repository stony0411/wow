package edu.nyu.wow.controller;

import edu.nyu.wow.dao.bo.PatientBo;
import edu.nyu.wow.dao.dto.PatientDto;
import edu.nyu.wow.dao.ibo.PatientIbo;
import edu.nyu.wow.dao.vo.PatientVo;
import edu.nyu.wow.entity.User;
import edu.nyu.wow.enums.ResponseStatus;
import edu.nyu.wow.meta.RequestContext;
import edu.nyu.wow.meta.SimpleResponse;
import edu.nyu.wow.service.IAccountService;
import edu.nyu.wow.service.IPatientService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
