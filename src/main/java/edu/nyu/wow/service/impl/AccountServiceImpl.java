package edu.nyu.wow.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.IService;
import edu.nyu.wow.entity.Account;
import edu.nyu.wow.entity.User;
import edu.nyu.wow.mapper.AccountMapper;
import edu.nyu.wow.service.IAccountService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

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



    @Override
    public User findByUsername(String username) {
        QueryWrapper<Account> wrapper = new QueryWrapper<>();
        wrapper.eq("account_name", username);
        Account account = getOne(wrapper);
        if (Objects.isNull(account)) {
            return null;
        }
        return new User(account.getAccountName(), account.getPassword(), account.getTypeId());
    }

}
