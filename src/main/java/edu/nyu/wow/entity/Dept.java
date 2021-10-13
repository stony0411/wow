package edu.nyu.wow.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author MyBatisPlusGenerator
 * @since 2021-10-13
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("DEPT")
public class Dept implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * The department id within the hospital
     */
    @TableId("DEPT_NO")
    private Integer deptNo;

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
    private Integer hospitalId;

    /**
     * TIME TBL CREATED
     */
    @TableField("TBL_CREATED_DT")
    private LocalDateTime tblCreatedDt;

    /**
     * LAST MODIFIED/UPDATED DATE
     */
    @TableField("TBL_LAST_DT")
    private LocalDateTime tblLastDt;


}
