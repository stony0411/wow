package edu.nyu.wow.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import edu.nyu.wow.dao.bo.PatientBo;
import edu.nyu.wow.dao.ibo.PatientIbo;
import edu.nyu.wow.dao.vo.PatientVo;
import edu.nyu.wow.entity.Patient;
import edu.nyu.wow.entity.User;
import edu.nyu.wow.mapper.PatientMapper;
import edu.nyu.wow.meta.RequestContext;
import edu.nyu.wow.meta.SimpleResponse;
import edu.nyu.wow.service.IPatientService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author MyBatisPlusGenerator
 * @since 2021-11-24
 */
@Service
public class PatientServiceImpl extends ServiceImpl<PatientMapper, Patient> implements IPatientService {

    @Autowired
    ModelMapper modelMapper;

    @Override
    public SimpleResponse<PatientBo> addPatient(PatientIbo patientIbo) {
        Patient patient = modelMapper.map(patientIbo, Patient.class);
        save(patient);
        PatientBo patientBo = modelMapper.map(patient, PatientBo.class);
        return new SimpleResponse<>(patientBo);
    }

    @Override
    public SimpleResponse<PatientBo> updatePatient(PatientIbo patientIbo) {
        Patient patient = modelMapper.map(patientIbo, Patient.class);
        QueryWrapper<Patient> wrapper = new QueryWrapper<>();
        User user = RequestContext.getCurrentUser();
        wrapper.eq("patient_id", user.getUserId());
        update(patient, wrapper);
        PatientBo patientBo = modelMapper.map(patient, PatientBo.class);
        return new SimpleResponse<>(patientBo);
    }

}
