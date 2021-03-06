package edu.nyu.wow.service;

import edu.nyu.wow.dao.bo.DeptBo;
import edu.nyu.wow.entity.Dept;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author MyBatisPlusGenerator
 * @since 2021-11-24
 */
public interface IDeptService extends IService<Dept> {

    DeptBo getById(Long deptId);

    List<DeptBo> listByHospitalId(Long hospitalId);

}
