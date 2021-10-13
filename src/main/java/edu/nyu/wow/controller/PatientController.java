package edu.nyu.wow.controller;

import edu.nyu.wow.bo.PatientBo;
import edu.nyu.wow.dto.PatientDto;
import edu.nyu.wow.ibo.PatientIbo;
import edu.nyu.wow.service.IPatientService;
import edu.nyu.wow.service.impl.PatientServiceImpl;
import edu.nyu.wow.vo.PatientVo;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: sw3455
 * @Date: 2021/10/13
 * @Email: sw3455@nyu.edu
 */
@RestController
@RequestMapping("/patient")
public class PatientController {

    @Autowired
    ModelMapper modelMapper;

    @Autowired
    IPatientService patientService;

    @PostMapping("/register")
    public void registerNewPatient(PatientVo vo) {
        //vo -> ibo type, since no computation needed
        patientService.addNewPatient(modelMapper.map(vo, PatientIbo.class));
    }

    @GetMapping("/getAllPatient")
    public List<PatientDto> getAllPatient(){
        return modelMapper.map(patientService.getAllPatient(),new TypeToken<List<PatientDto>>(){}.getType());
    }
}
