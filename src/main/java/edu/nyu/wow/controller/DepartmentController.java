package edu.nyu.wow.controller;

import edu.nyu.wow.ibo.HospitalIbo;
import edu.nyu.wow.meta.SimpleResponse;
import edu.nyu.wow.service.IDeptService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: sw3455
 * @Date: 2021/12/7
 * @Email: sw3455@nyu.edu
 */
@RestController
@RequestMapping("/Department")
public class DepartmentController {
/*    @Autowired
    ModelMapper modelMapper;

    @Autowired
    IDeptService deptService;

    @PostMapping("/newDept")
    public SimpleResponse<String> newDept(@RequestBody DeptVo vo){
        return hospitalService.addHospital(modelMapper.map(vo, HospitalIbo.class));
    }*/
}
