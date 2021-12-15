package edu.nyu.wow.controller;

import edu.nyu.wow.dao.bo.AppointmentBo;
import edu.nyu.wow.dao.bo.RegistrationBo;
import edu.nyu.wow.dao.dto.AppointmentDto;
import edu.nyu.wow.dao.dto.RegistrationDto;
import edu.nyu.wow.dao.ibo.AppointmentIbo;
import edu.nyu.wow.dao.vo.AppointmentVo;
import edu.nyu.wow.entity.Appointment;
import edu.nyu.wow.entity.Registration;
import edu.nyu.wow.entity.User;
import edu.nyu.wow.meta.RequestContext;
import edu.nyu.wow.meta.SimpleResponse;
import edu.nyu.wow.service.IAppointmentService;
import edu.nyu.wow.service.IRegistrationService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    IAppointmentService appointmentService;

    @Autowired
    ModelMapper modelMapper;

    @PostMapping("/new")
    public SimpleResponse<AppointmentDto> newReg(@RequestBody AppointmentVo vo) {
        User user = RequestContext.getCurrentUser();
        RegistrationBo registrationBo = registrationService.newReg(user.getUserId());
        AppointmentIbo appointmentIbo = modelMapper.map(vo, AppointmentIbo.class);
        appointmentIbo.setAptId(null);
        appointmentIbo.setRegId(registrationBo.getRegId());
        appointmentIbo.setAppointmentTime(new Date());
        AppointmentBo appointmentBo = appointmentService.newApp(appointmentIbo);
        AppointmentDto appointmentDto = modelMapper.map(appointmentBo, AppointmentDto.class);
        appointmentDto.setDeptName("add it later");
        appointmentDto.setHospitalName("add it later");
        return new SimpleResponse<>(appointmentDto);
    }

    @GetMapping("getMyRegList")
    public SimpleResponse<List<RegistrationDto>> getMyRegList() {
        User user = RequestContext.getCurrentUser();
        List<RegistrationBo> registrationBos = registrationService.listByPatientId(user.getUserId());
        List<RegistrationDto> registrationDtos = modelMapper.map(registrationBos, new TypeToken<List<RegistrationDto>>(){}.getType());
        return new SimpleResponse<>(registrationDtos);
    }


}
