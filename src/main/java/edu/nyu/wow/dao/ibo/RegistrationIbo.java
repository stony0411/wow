package edu.nyu.wow.dao.ibo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
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
public class RegistrationIbo implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long regId;

    private Date regDate;

    private Date appointmentTime;

    private String symptoms;

    private Long deptNo;

    private Long patientId;

    private Date tblCreatedDt;

    private Date tblLastDt;

}
