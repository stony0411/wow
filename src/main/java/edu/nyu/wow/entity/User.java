package edu.nyu.wow.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Author: sw3455
 * @Date: 2021/12/10
 * @Email: sw3455@nyu.edu
 */
@Data
@AllArgsConstructor
public class User {
    private static final long serialVersionUID = 1L;

    private String username;

    private String password;

    private Integer role;

}
