package edu.nyu.wow.dao.vo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author MyBatisPlusGenerator
 * @since 2021-12-16
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("REGISTRATION")
public class RegistrationVo implements Serializable {

    private static final long serialVersionUID = 1L;

    private Date appointmentTime;

    private String symptoms;

    private Long deptNo;

    private Long patientId;

}
