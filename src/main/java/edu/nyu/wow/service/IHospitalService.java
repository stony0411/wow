package edu.nyu.wow.service;

import edu.nyu.wow.dao.bo.HospitalBo;
import edu.nyu.wow.entity.Hospital;
import com.baomidou.mybatisplus.extension.service.IService;
import edu.nyu.wow.dao.ibo.HospitalIbo;
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
public interface IHospitalService extends IService<Hospital> {

    void addHospital(HospitalIbo ibo);

    SimpleResponse<List<HospitalBo>> listHospital();

    SimpleResponse<HospitalBo> hospitalDetail(Long hospitalId);

    SimpleResponse<List<HospitalBo>> searchHospital(HospitalIbo hospitalIbo);
}
