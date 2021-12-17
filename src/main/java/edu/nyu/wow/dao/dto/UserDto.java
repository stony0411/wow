package edu.nyu.wow.dao.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

/**
 * @Author: sw3455
 * @Date: 2021/12/13
 * @Email: sw3455@nyu.edu
 */
@Data
@AllArgsConstructor
@Builder
public class UserDto {
    private String username;

    private String email;

    private String question1;

    private String question2;

}
