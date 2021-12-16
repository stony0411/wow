package edu.nyu.wow.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import edu.nyu.wow.dao.bo.DeptBo;
import edu.nyu.wow.entity.Dept;
import edu.nyu.wow.mapper.DeptMapper;
import edu.nyu.wow.service.IDeptService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.jws.WebParam;
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
public class DeptServiceImpl extends ServiceImpl<DeptMapper, Dept> implements IDeptService {

    @Autowired
    ModelMapper modelMapper;

    @Override
    public DeptBo getById(Long deptId) {
        Dept dept = new Dept();
        dept.setDeptNo(deptId);
        QueryWrapper<Dept> wrapper = new QueryWrapper<>();
        wrapper.setEntity(dept);
        dept = getOne(wrapper);
        return modelMapper.map(dept, DeptBo.class);
    }

    @Override
    public List<DeptBo> listByHospitalId(Long hospitalId) {
        Dept dept = new Dept();
        dept.setHospitalId(hospitalId);
        QueryWrapper<Dept> wrapper = new QueryWrapper<>();
        wrapper.setEntity(dept);
        List<Dept> depts = list(wrapper);
        return modelMapper.map(depts, new TypeToken<List<DeptBo>>(){}.getType());
    }

}
