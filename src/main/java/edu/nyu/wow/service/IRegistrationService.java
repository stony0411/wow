package edu.nyu.wow.service;

import edu.nyu.wow.dao.bo.RegistrationBo;
import edu.nyu.wow.entity.Registration;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author MyBatisPlusGenerator
 * @since 2021-12-15
 */
public interface IRegistrationService extends IService<Registration> {

    RegistrationBo newReg(Long patientId);

    List<RegistrationBo> listByPatientId(Long patientId);

}
