package edu.nyu.wow.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
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
 * @since 2021-11-24
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("NONMEDICAL")
public class Nonmedical implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * The id of the worker employment and primary key
     */
    @TableId("EMPLOYEE_ID")
    private Integer employeeId;

    /**
     * THE JOB TITLE FOR NON-MEDICAL WORKERS
     */
    @TableField("JOB_TITLE")
    private String jobTitle;


}
