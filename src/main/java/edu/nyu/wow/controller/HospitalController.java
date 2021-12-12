package edu.nyu.wow.controller;

import edu.nyu.wow.bo.HospitalBo;
import edu.nyu.wow.dto.HospitalDto;
import edu.nyu.wow.entity.Hospital;
import edu.nyu.wow.ibo.HospitalIbo;
import edu.nyu.wow.meta.SimpleResponse;
import edu.nyu.wow.service.IHospitalService;
import edu.nyu.wow.vo.HospitalVo;
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
@RequestMapping("/Hospital")
public class HospitalController {
    @Autowired
    ModelMapper modelMapper;

    @Autowired
    IHospitalService hospitalService;

    @PostMapping("/newHospital")
    public SimpleResponse<String> newHospital(@RequestBody HospitalVo vo){
        return hospitalService.addHospital(modelMapper.map(vo, HospitalIbo.class));
    }

    @GetMapping("/listHospital")
    public SimpleResponse<List<HospitalDto>> listHospital() {
        List<HospitalDto> hospitalDtos = modelMapper.map(hospitalService.listHospital().getData(), new TypeToken<List<HospitalDto>>(){}.getType());
        return new SimpleResponse<>(hospitalDtos);
    }

    @GetMapping("hospital/{hospitalId}")
    public SimpleResponse<HospitalDto> hospitalDetail(@PathVariable("hospitalId") Long hospitalId) {
        HospitalDto hospitalDto = modelMapper.map(hospitalService.hospitalDetail(hospitalId).getData(), HospitalDto.class);
        return new SimpleResponse<>(hospitalDto);
    }

    @GetMapping("searchHospital")
    public SimpleResponse<List<HospitalDto>> searchHospital(HospitalVo vo) {
        HospitalIbo ibo = modelMapper.map(vo,HospitalIbo.class);
        List<HospitalDto> hospitalDtos = modelMapper.map(hospitalService.searchHospital(ibo).getData(), new TypeToken<List<HospitalDto>>(){}.getType());
        return new SimpleResponse<>(hospitalDtos);
    }

}
