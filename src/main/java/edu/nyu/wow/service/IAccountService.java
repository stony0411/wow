package edu.nyu.wow.service;

import edu.nyu.wow.dao.dto.UserDto;
import edu.nyu.wow.entity.Account;
import com.baomidou.mybatisplus.extension.service.IService;
import edu.nyu.wow.entity.User;
import edu.nyu.wow.enums.UserRole;
import edu.nyu.wow.dao.vo.UserVo;

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

    void addNewUser(UserVo user, UserRole userRole);

    void updateUserId(User user);

    boolean checkQuestions(UserVo userVo);

    void updatePassword(UserVo userVo);

    UserDto accountInfo();
}
