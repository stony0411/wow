package edu.nyu.wow.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import java.util.Date;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Value;

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
public class Registration implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "REG_ID", type = IdType.AUTO)
    private Long regId;

    @TableField("REG_DATE")
    private Date regDate;

    @TableField("APPOINTMENT_TIME")
    private Date appointmentTime;

    @TableField("SYMPTOMS")
    private String symptoms;

    @TableField("DEPT_NO")
    private Long deptNo;

    @TableField("PATIENT_ID")
    private Long patientId;

    @TableField("TBL_CREATED_DT")
    private Date tblCreatedDt;

    @TableField("TBL_LAST_DT")
    private Date tblLastDt;

}
