package edu.nyu.wow.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import edu.nyu.wow.dao.bo.RegistrationBo;
import edu.nyu.wow.dao.ibo.RegistrationIbo;
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
 * @since 2021-12-16
 */
@Service
public class RegistrationServiceImpl extends ServiceImpl<RegistrationMapper, Registration> implements IRegistrationService {

    @Autowired
    ModelMapper modelMapper;

    @Override
    public RegistrationBo newReg(RegistrationIbo registrationIbo) {
        Registration registration = modelMapper.map(registrationIbo, Registration.class);
        save(registration);
        return modelMapper.map(registration, RegistrationBo.class);
    }

    @Override
    public List<RegistrationBo> list(Long userId) {
        QueryWrapper<Registration> wrapper = new QueryWrapper<>();
        Registration registration = new Registration();
        registration.setPatientId(userId);
        wrapper.setEntity(registration);
        List<Registration> registrations = list(wrapper);
        return modelMapper.map(registrations, new TypeToken<List<RegistrationBo>>(){}.getType());
    }

}
