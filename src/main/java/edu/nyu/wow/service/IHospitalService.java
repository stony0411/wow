package edu.nyu.wow.service;

import edu.nyu.wow.entity.Hospital;
import com.baomidou.mybatisplus.extension.service.IService;
import edu.nyu.wow.ibo.HospitalIbo;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author MyBatisPlusGenerator
 * @since 2021-10-13
 */
public interface IHospitalService extends IService<Hospital> {

    void addHospital(HospitalIbo ibo);
}
