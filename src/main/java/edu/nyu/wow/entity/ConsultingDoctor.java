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
@TableName("CONSULTING_DOCTOR")
public class ConsultingDoctor implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * The id of the worker employment and primary key
     */
    @TableId("EMPLOYEE_ID")
    private Integer employeeId;

    /**
     * SPECIALTY
     */
    @TableField("SPECIALTY")
    private String specialty;

    /**
     * THE CONTRACT NUMBER FOR CONSULTING DOC
     */
    @TableField("CONTRACT_NUMBER")
    private BigDecimal contractNumber;

    /**
     * THE DATE WHEN CONTRACT ENDS
     */
    @TableField("CONTRACT_DATE")
    private LocalDateTime contractDate;

    /**
     * THE RATE OF CONTRACT FOR CONSULTING DOC
     */
    @TableField("WEEKLY_CONTRACT_RATE")
    private BigDecimal weeklyContractRate;

    /**
     * THE MINIMUM WEEKLY HOURS OF WORK BY CONSULTING DOC
     */
    @TableField("MIN_WEEKLY_HOURS")
    private BigDecimal minWeeklyHours;

    /**
     * THE OVERTIME RATE PER HOUR FOR CONSULTING DOC
     */
    @TableField("OVERTIME_RATE")
    private BigDecimal overtimeRate;


}
