package edu.nyu.wow.service.impl;

import edu.nyu.wow.entity.Patient;
import edu.nyu.wow.mapper.PatientMapper;
import edu.nyu.wow.service.IPatientService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
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

}
