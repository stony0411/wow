package edu.nyu.wow.service;

import edu.nyu.wow.dao.bo.RegistrationBo;
import edu.nyu.wow.dao.ibo.RegistrationIbo;
import edu.nyu.wow.entity.Registration;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author MyBatisPlusGenerator
 * @since 2021-12-16
 */
public interface IRegistrationService extends IService<Registration> {

    RegistrationBo newReg(RegistrationIbo registrationIbo);

    List<RegistrationBo> list(Long userId);
}
