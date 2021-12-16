package edu.nyu.wow.controller;

import edu.nyu.wow.dao.bo.DeptBo;
import edu.nyu.wow.dao.bo.HospitalBo;
import edu.nyu.wow.dao.bo.RegistrationBo;
import edu.nyu.wow.dao.dto.RegistrationDto;
import edu.nyu.wow.dao.ibo.RegistrationIbo;
import edu.nyu.wow.dao.vo.RegistrationVo;
import edu.nyu.wow.entity.User;
import edu.nyu.wow.meta.RequestContext;
import edu.nyu.wow.meta.SimpleResponse;
import edu.nyu.wow.service.IDeptService;
import edu.nyu.wow.service.IHospitalService;
import edu.nyu.wow.service.IRegistrationService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Author: sw3455
 * @Date: 2021/12/15
 * @Email: sw3455@nyu.edu
 */
@RestController
@RequestMapping("/reg")
public class RegistrationController {

    @Autowired
    IRegistrationService registrationService;

    @Autowired
    IDeptService deptService;

    @Autowired
    IHospitalService hospitalService;

    @Autowired
    ModelMapper modelMapper;

    @PostMapping("/new")
    public SimpleResponse<RegistrationDto> newReg(@RequestBody RegistrationVo vo) {
        User user = RequestContext.getCurrentUser();
        RegistrationIbo registrationIbo = modelMapper.map(vo, RegistrationIbo.class);
        registrationIbo.setPatientId(user.getUserId());
        registrationIbo.setRegDate(new Date());
        RegistrationBo registrationBo = registrationService.newReg(registrationIbo);
        RegistrationDto registrationDto = modelMapper.map(registrationBo, RegistrationDto.class);
        return new SimpleResponse<>(fillInNames(registrationDto));
    }

    @GetMapping("getMyRegList")
    public SimpleResponse<List<RegistrationDto>> getMyRegList() {
        User user = RequestContext.getCurrentUser();
        List<RegistrationBo> registrationBos = registrationService.list(user.getUserId());
        List<RegistrationDto> registrationDtos = modelMapper.map(registrationBos, new TypeToken<List<RegistrationDto>>(){}.getType());
        List<RegistrationDto> registrationDtos1 = new ArrayList<>();
        registrationDtos.forEach(e -> registrationDtos1.add(fillInNames(e)));
        return new SimpleResponse<>(registrationDtos1);
    }

    private RegistrationDto fillInNames(RegistrationDto registrationDto) {
        DeptBo deptBo = deptService.getById(registrationDto.getDeptNo());
        registrationDto.setDeptName(deptBo.getDeptName());
        HospitalBo hospitalBo = hospitalService.hospitalDetail(deptBo.getHospitalId()).getData();
        registrationDto.setHospitalName(hospitalBo.getHospitalName());
        return registrationDto;
    }
}
