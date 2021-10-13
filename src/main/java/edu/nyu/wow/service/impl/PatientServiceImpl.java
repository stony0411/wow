package edu.nyu.wow.service.impl;

import edu.nyu.wow.bo.PatientBo;
import edu.nyu.wow.entity.Patient;
import edu.nyu.wow.ibo.PatientIbo;
import edu.nyu.wow.mapper.PatientMapper;
import edu.nyu.wow.service.IPatientService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author MyBatisPlusGenerator
 * @since 2021-10-13
 */
@Service
public class PatientServiceImpl extends ServiceImpl<PatientMapper, Patient> implements IPatientService {

    @Autowired
    ModelMapper modelMapper;

    @Override
    public void addNewPatient(PatientIbo ibo) {
        Patient patient = modelMapper.map(ibo, Patient.class);
        save(patient);
    }
}
