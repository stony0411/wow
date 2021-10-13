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
 * @since 2021-10-13
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("FULLTIME_DOCTOR")
public class FulltimeDoctor implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * The id of the worker employment and primary key
     */
    @TableId("EMPLOYEE_ID")
    private Integer employeeId;

    /**
     * YEARLY COMPENSATION FOR FULLTIME DOC
     */
    @TableField("YEARLY_COMPENSATION")
    private Long yearlyCompensation;

    /**
     * SPECIALTY
     */
    @TableField("SPECIALTY")
    private String specialty;


}
