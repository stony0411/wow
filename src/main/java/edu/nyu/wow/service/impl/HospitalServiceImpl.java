package edu.nyu.wow.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import edu.nyu.wow.bo.HospitalBo;
import edu.nyu.wow.entity.Hospital;
import edu.nyu.wow.ibo.HospitalIbo;
import edu.nyu.wow.mapper.HospitalMapper;
import edu.nyu.wow.meta.SimpleResponse;
import edu.nyu.wow.service.IHospitalService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import net.bytebuddy.asm.MemberSubstitution;
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
 * @since 2021-11-24
 */
@Service
public class HospitalServiceImpl extends ServiceImpl<HospitalMapper, Hospital> implements IHospitalService {
    @Autowired
    ModelMapper modelMapper;

    @Override
    public SimpleResponse<String> addHospital(HospitalIbo ibo) {
        Hospital hospital = modelMapper.map(ibo, Hospital.class);
        save(hospital);
        return new SimpleResponse<>();
    }

    @Override
    public SimpleResponse<List<HospitalBo>> listHospital() {
        List<Hospital> hospitals = list(new QueryWrapper<>());
        List<HospitalBo> hospitalBos = modelMapper.map(hospitals,new TypeToken<List<HospitalBo>>(){}.getType());
        return new SimpleResponse<>(hospitalBos);
    }

    @Override
    public SimpleResponse<HospitalBo> hospitalDetail(Long hospitalId) {
        return new SimpleResponse<>(modelMapper.map(getById(hospitalId), HospitalBo.class)) ;
    }
}
