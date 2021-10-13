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
@TableName("NURSE")
public class Nurse implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * The id of the worker employment and primary key
     */
    @TableId("EMPLOYEE_ID")
    private Integer employeeId;

    /**
     * LICENSE NUMBER OF NURSE
     */
    @TableField("LICENSE_NUMBER")
    private BigDecimal licenseNumber;

    /**
     * DATE FOR NURSE LICENSE
     */
    @TableField("LICENSE_DATE")
    private LocalDateTime licenseDate;


}
