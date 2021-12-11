package edu.nyu.wow.controller;

import edu.nyu.wow.entity.User;
import edu.nyu.wow.enums.ResponseStatus;
import edu.nyu.wow.meta.SimpleResponse;
import edu.nyu.wow.service.IAccountService;
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
    public SimpleResponse<String> login(@RequestBody User user, HttpSession session) {
        User backEndUser = accountService.findByUsername(user.getUsername());
        if (Objects.isNull(backEndUser)) {
            return new SimpleResponse<>("Can not find username", ResponseStatus.ERROR);
        }

        if (backEndUser.getPassword().equals(user.getPassword())) {
            session.setAttribute("user", user);
            return new SimpleResponse<>("Login Successfully", ResponseStatus.SUCCESS);
        }

        return new SimpleResponse<>("Invalid Password", ResponseStatus.ERROR);
    }

    @GetMapping("/logout")
    public SimpleResponse<String> logout(HttpSession session) {
        session.removeAttribute("user");
        return new SimpleResponse<>("Logout Successfully", ResponseStatus.SUCCESS);
    }
}
