package edu.nyu.wow.service.impl;

import edu.nyu.wow.entity.Hospital;
import edu.nyu.wow.ibo.HospitalIbo;
import edu.nyu.wow.mapper.HospitalMapper;
import edu.nyu.wow.service.IHospitalService;
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
 * @since 2021-10-13
 */
@Service
public class HospitalServiceImpl extends ServiceImpl<HospitalMapper, Hospital> implements IHospitalService {

    @Autowired
    ModelMapper modelMapper;

    @Override
    public void addHospital(HospitalIbo ibo) {
        Hospital hospital = modelMapper.map(ibo, Hospital.class);
        save(hospital);
    }
}
