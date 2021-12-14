package edu.nyu.wow.controller;

import edu.nyu.wow.entity.User;
import edu.nyu.wow.enums.ResponseStatus;
import edu.nyu.wow.enums.UserRole;
import edu.nyu.wow.meta.RequestContext;
import edu.nyu.wow.meta.SimpleResponse;
import edu.nyu.wow.service.IAccountService;
import edu.nyu.wow.dao.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.Objects;

/**
 * @Author: sw3455
 * @Date: 2021/12/10
 * @Email: sw3455@nyu.edu
 */
@RestController
public class SessionController {

    @Autowired
    IAccountService accountService;

    @PostMapping("/login")
    public SimpleResponse<String> login(@RequestBody UserVo user, HttpSession session) {
        User backEndUser = accountService.findByUsername(user.getUsername());
        if (Objects.isNull(backEndUser)) {
            return new SimpleResponse<>("Can not find username", ResponseStatus.ERROR);
        }

        if (backEndUser.getPassword().equals(user.getPassword())) {
            session.setAttribute("user", backEndUser);
            System.out.println(RequestContext.getCurrentUser() + " loged in.");
            return new SimpleResponse<>("Login Successfully", ResponseStatus.SUCCESS);
        }

        return new SimpleResponse<>("Invalid Password", ResponseStatus.ERROR);
    }

    @PostMapping("/register")
    public SimpleResponse<String> registerPatient(@RequestBody UserVo user, HttpSession session) {
        User backEndUser = accountService.findByUsername(user.getUsername());
        if (!Objects.isNull(backEndUser)) {
            return new SimpleResponse<>("Username existed", ResponseStatus.ERROR);
        }
        accountService.addNewUser(user, UserRole.PATIENT);
        login(user, session);
        return new SimpleResponse<>("Register Successfully", ResponseStatus.SUCCESS);
    }

    @GetMapping("/logout")
    public SimpleResponse<String> logout(HttpSession session) {
        System.out.println(RequestContext.getCurrentUser() + " loged out.");
        session.removeAttribute("user");
        return new SimpleResponse<>("Logout Successfully", ResponseStatus.SUCCESS);
    }
}
