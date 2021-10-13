package edu.nyu.wow.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import edu.nyu.wow.bo.PatientBo;
import edu.nyu.wow.entity.Patient;
import edu.nyu.wow.ibo.PatientIbo;
import edu.nyu.wow.mapper.PatientMapper;
import edu.nyu.wow.service.IPatientService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

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

    @Override
    public List<PatientBo> getAllPatient(){
        return modelMapper.map(list(),new TypeToken<List<PatientBo>>(){}.getType());
    }


}
