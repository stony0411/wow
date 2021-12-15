package edu.nyu.wow.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import edu.nyu.wow.dao.bo.RegistrationBo;
import edu.nyu.wow.entity.Registration;
import edu.nyu.wow.mapper.RegistrationMapper;
import edu.nyu.wow.service.IRegistrationService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author MyBatisPlusGenerator
 * @since 2021-12-15
 */
@Service
public class RegistrationServiceImpl extends ServiceImpl<RegistrationMapper, Registration> implements IRegistrationService {

    @Autowired
    ModelMapper modelMapper;

    public RegistrationBo newReg(Long patientId) {
        Registration registration = Registration.builder()
                .patientId(patientId)
                .build();
        save(registration);
        return modelMapper.map(registration, RegistrationBo.class);
    }

    public List<RegistrationBo> listByPatientId(Long patientId) {
        QueryWrapper<Registration> wrapper = new QueryWrapper<>();
        wrapper.eq("PATIENT_ID", patientId);
        List<Registration> registrations = list(wrapper);
        return modelMapper.map(registrations, new TypeToken<List<RegistrationBo>>(){}.getType());
    }

}
