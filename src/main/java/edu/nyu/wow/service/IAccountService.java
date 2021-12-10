package edu.nyu.wow.service;

import edu.nyu.wow.entity.Account;
import com.baomidou.mybatisplus.extension.service.IService;
import edu.nyu.wow.entity.User;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author MyBatisPlusGenerator
 * @since 2021-11-24
 */
public interface IAccountService extends IService<Account> {

    User findByUsername(String username);
}
