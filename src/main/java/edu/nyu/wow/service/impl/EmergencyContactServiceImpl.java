package edu.nyu.wow.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import edu.nyu.wow.dao.bo.EmergencyContactBo;
import edu.nyu.wow.dao.ibo.EmergencyContactIbo;
import edu.nyu.wow.entity.EmergencyContact;
import edu.nyu.wow.mapper.EmergencyContactMapper;
import edu.nyu.wow.meta.SimpleResponse;
import edu.nyu.wow.service.IEmergencyContactService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Wrapper;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author MyBatisPlusGenerator
 * @since 2021-11-24
 */
@Service
public class EmergencyContactServiceImpl extends ServiceImpl<EmergencyContactMapper, EmergencyContact> implements IEmergencyContactService {

    @Autowired
    ModelMapper modelMapper;

    @Override
    public EmergencyContactBo add(EmergencyContactIbo ibo) {
        EmergencyContact emergencyContact = modelMapper.map(ibo, EmergencyContact.class);
        save(emergencyContact);
        return modelMapper.map(emergencyContact, EmergencyContactBo.class);
    }

    @Override
    public List<EmergencyContactBo> list(Long userId) {
        QueryWrapper<EmergencyContact> wrapper = new QueryWrapper<>();
        wrapper.eq("patient_id", userId);
        List<EmergencyContact> emergencyContacts = list(wrapper);
        List<EmergencyContactBo> bos = modelMapper.map(emergencyContacts, new TypeToken<List<EmergencyContactBo>>(){}.getType());
        return bos;
    }
}
