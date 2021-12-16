package edu.nyu.wow.controller;

import edu.nyu.wow.dao.bo.DeptBo;
import edu.nyu.wow.dao.dto.DeptDto;
import edu.nyu.wow.dao.dto.HospitalDto;
import edu.nyu.wow.dao.ibo.HospitalIbo;
import edu.nyu.wow.meta.SimpleResponse;
import edu.nyu.wow.service.IDeptService;
import edu.nyu.wow.service.IHospitalService;
import edu.nyu.wow.dao.vo.HospitalVo;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: sw3455
 * @Date: 2021/11/24
 * @Email: sw3455@nyu.edu
 */
@RestController
@RequestMapping("/hospital")
public class HospitalController {
    @Autowired
    ModelMapper modelMapper;

    @Autowired
    IHospitalService hospitalService;

    @Autowired
    IDeptService deptService;

    @PostMapping("/newHospital")
    public SimpleResponse<String> newHospital(@RequestBody HospitalVo vo){
        hospitalService.addHospital(modelMapper.map(vo, HospitalIbo.class));
        return new SimpleResponse<>("Add a hospital successfully");
    }

    @GetMapping("/listHospital")
    public SimpleResponse<List<HospitalDto>> listHospital() {
        List<HospitalDto> hospitalDtos = modelMapper.map(hospitalService.listHospital().getData(), new TypeToken<List<HospitalDto>>(){}.getType());
        return new SimpleResponse<>(hospitalDtos);
    }

    @GetMapping("/{hospitalId}")
    public SimpleResponse<HospitalDto> hospitalDetail(@PathVariable("hospitalId") Long hospitalId) {
        HospitalDto hospitalDto = modelMapper.map(hospitalService.hospitalDetail(hospitalId).getData(), HospitalDto.class);
        return new SimpleResponse<>(hospitalDto);
    }

    @GetMapping("/{hospitalId}/listDepts")
    public SimpleResponse<DeptDto> listDepts(@PathVariable("hospitalId") Long hospitalId) {
        List<DeptBo> deptBos = deptService.listByHospitalId(hospitalId);
        return new SimpleResponse<>(modelMapper.map(deptBos, new TypeToken<List<DeptDto>>(){}.getType()));
    }

    @GetMapping("searchHospital")
    public SimpleResponse<List<HospitalDto>> searchHospital(HospitalVo vo) {
        HospitalIbo ibo = modelMapper.map(vo,HospitalIbo.class);
        List<HospitalDto> hospitalDtos = modelMapper.map(hospitalService.searchHospital(ibo).getData(), new TypeToken<List<HospitalDto>>(){}.getType());
        return new SimpleResponse<>(hospitalDtos);
    }

}
