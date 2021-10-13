package edu.nyu.wow.controller;

import edu.nyu.wow.ibo.HospitalIbo;
import edu.nyu.wow.service.IHospitalService;
import edu.nyu.wow.vo.HospitalVo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: yw5211
 * @Date: 10/13/2021
 * @Email: yw5211@nyu.edu
 */

@RestController
@RequestMapping("/Hospital")
public class HospitalController {
    @Autowired
    ModelMapper modelMapper;

    @Autowired
    IHospitalService hospitalService;

    @PostMapping("/newHospital")
    public void newHospital(HospitalVo vo){
        hospitalService.addHospital(modelMapper.map(vo, HospitalIbo.class));
    }
}
