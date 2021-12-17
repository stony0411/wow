package edu.nyu.wow.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import edu.nyu.wow.dao.dto.UserDto;
import edu.nyu.wow.entity.Account;
import edu.nyu.wow.entity.User;
import edu.nyu.wow.enums.UserRole;
import edu.nyu.wow.mapper.AccountMapper;
import edu.nyu.wow.meta.RequestContext;
import edu.nyu.wow.service.IAccountService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import edu.nyu.wow.dao.vo.UserVo;
import lombok.Builder;
import org.apache.ibatis.annotations.Update;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.jws.WebParam;
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

    @Autowired
    ModelMapper modelMapper;

    @Override
    public User findByUsername(String username) {
        QueryWrapper<Account> wrapper = new QueryWrapper<>();
        wrapper.eq("account_name", username);
        Account account = getOne(wrapper);
        if (Objects.isNull(account)) {
            return null;
        }
        return new User(account.getAccountName(), account.getPassword(), account.getTypeId(), account.getUserId());
    }

    @Override
    public void addNewUser(UserVo user, UserRole userRole) {
        Account account = Account.builder()
                .accountName(user.getUsername())
                .password(user.getPassword())
                .typeId(userRole.getRoleId())
                .email(user.getEmail())
                .question1(user.getQuestion1())
                .question2(user.getQuestion2())
                .answer1(user.getAnswer1())
                .answer2(user.getAnswer2())
                .build();
        save(account);
    }

    @Override
    public void updateUserId(User user) {
        UpdateWrapper<Account> wrapper = new UpdateWrapper<>();
        wrapper.eq("account_name", user.getUsername());
        wrapper.set("user_id", user.getUserId());
        update(wrapper);
    }

    @Override
    public boolean checkQuestions(UserVo userVo) {
        QueryWrapper<Account> wrapper = new QueryWrapper<>();
        wrapper.eq("account_name", RequestContext.getCurrentUser().getUsername());
        Account account = getOne(wrapper);
        if (account.getAnswer1().equals(userVo.getAnswer1()) && account.getAnswer2().equals(userVo.getAnswer2())) {
            return true;
        }
        return false;
    }

    @Override
    public void updatePassword(UserVo userVo) {
        QueryWrapper<Account> wrapper = new QueryWrapper<>();
        wrapper.eq("account_name", RequestContext.getCurrentUser().getUsername());
        Account account = getOne(wrapper);
        account.setPassword(userVo.getPassword());
        update(account, wrapper);
    }

    @Override
    public UserDto accountInfo() {
        User user = RequestContext.getCurrentUser();
        QueryWrapper<Account> wrapper = new QueryWrapper<>();
        wrapper.eq("account_name", user.getUsername());
        Account account = getOne(wrapper);
        UserDto userDto = UserDto.builder()
                .username(account.getAccountName())
                .email(account.getEmail())
                .question1(account.getQuestion1())
                .question2(account.getQuestion2())
                .build();
        return userDto;
    }

}
