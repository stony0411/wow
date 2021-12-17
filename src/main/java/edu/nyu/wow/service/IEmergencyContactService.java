package edu.nyu.wow.service;

import edu.nyu.wow.dao.bo.EmergencyContactBo;
import edu.nyu.wow.dao.ibo.EmergencyContactIbo;
import edu.nyu.wow.entity.EmergencyContact;
import com.baomidou.mybatisplus.extension.service.IService;
import edu.nyu.wow.meta.SimpleResponse;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author MyBatisPlusGenerator
 * @since 2021-11-24
 */
public interface IEmergencyContactService extends IService<EmergencyContact> {

    EmergencyContactBo add(EmergencyContactIbo ibo);

    List<EmergencyContactBo> list(Long userId);

    void delete(Long contactId);
}
