package edu.nyu.wow.manager;

import edu.nyu.wow.entity.User;
import edu.nyu.wow.service.IAccountService;
import edu.nyu.wow.service.impl.AccountServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author: sw3455
 * @Date: 2021/12/10
 * @Email: sw3455@nyu.edu
 */
public class UserService implements UserDetailsService {

    @Autowired
    IAccountService accountService;

    @Override
    @Transactional
    public User loadUserByUsername(String s) throws UsernameNotFoundException {
        return accountService.findByUsername(s);
    }
}
