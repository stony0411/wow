package edu.nyu.wow.service.impl;

import edu.nyu.wow.entity.Employee;
import edu.nyu.wow.mapper.EmployeeMapper;
import edu.nyu.wow.service.IEmployeeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
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
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements IEmployeeService {

}
