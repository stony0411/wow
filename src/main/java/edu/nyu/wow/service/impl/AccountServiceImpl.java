package edu.nyu.wow.service.impl;

import edu.nyu.wow.entity.Account;
import edu.nyu.wow.mapper.AccountMapper;
import edu.nyu.wow.service.IAccountService;
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
public class AccountServiceImpl extends ServiceImpl<AccountMapper, Account> implements IAccountService {

}
