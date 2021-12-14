package edu.nyu.wow.vo;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Author: sw3455
 * @Date: 2021/12/13
 * @Email: sw3455@nyu.edu
 */
@Data
@AllArgsConstructor
public class UserVo {
    private String username;

    private String password;
}
