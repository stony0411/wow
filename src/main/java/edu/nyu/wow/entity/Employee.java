package edu.nyu.wow.entity;

import java.math.BigDecimal;
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
@TableName("EMPLOYEE")
public class Employee implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * The id of the worker employment and primary key
     */
    @TableId("EMPLOYEE_ID")
    private Integer employeeId;

    /**
     * DISCRIMINATOR BETWEEN DIFFERENT JOBS
     */
    @TableField("EMP_TYPE")
    private String empType;

    /**
     * The FIRST name of the worker
     */
    @TableField("FNAME")
    private String fname;

    /**
     * LASTNAME OF WORKER
     */
    @TableField("LNAME")
    private String lname;

    /**
     * THE OFFICE CONTACT NUMBER FOR WORKER
     */
    @TableField("OFFICE_CONTACT")
    private Long officeContact;

    /**
     * The phone number of the worker
     */
    @TableField("PERSONAL_CONTACT")
    private Long personalContact;

    /**
     * THE TIME EMPLOYMENT BEGIN
     */
    @TableField("EMP_START_TIME")
    private LocalDateTime empStartTime;

    /**
     * WHETHER THIS EMPLOYEE IS ON JOB
     */
    @TableField("ON_JOB")
    private BigDecimal onJob;

    /**
     * THE SHIFT TIME FOR THEM
     */
    @TableField("SHIFT_TIME")
    private String shiftTime;

    /**
     * LAST MODIFIED/UPDATED DATE
     */
    @TableField("TBL_LAST_DT")
    private LocalDateTime tblLastDt;

    /**
     * TIME TBL CREATED
     */
    @TableField("TBL_CREATED_DT")
    private LocalDateTime tblCreatedDt;

    @TableField("DEPT_NO")
    private Integer deptNo;


}
