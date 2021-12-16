package edu.nyu.wow.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import java.util.Date;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author MyBatisPlusGenerator
 * @since 2021-11-24
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("DEPT")
public class Dept implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * The department id within the hospital
     */
    @TableId(value = "DEPT_NO", type = IdType.AUTO)
    private Long deptNo;

    /**
     * The name of the department
     */
    @TableField("DEPT_NAME")
    private String deptName;

    /**
     * The address of the department including floor and building
     */
    @TableField("DEPT_ADDRESS")
    private String deptAddress;

    /**
     * The contact number for the department
     */
    @TableField("DEPT_CONTACT")
    private Long deptContact;

    @TableField("HOSPITAL_ID")
    private Long hospitalId;

    /**
     * TIME TBL CREATED
     */
    @TableField("TBL_CREATED_DT")
    private Date tblCreatedDt;

    /**
     * LAST MODIFIED/UPDATED DATE
     */
    @TableField("TBL_LAST_DT")
    private Date tblLastDt;

}
