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
 * @since 2021-11-24
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("INSURANCE_PLAN")
public class InsurancePlan implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * UNIQUE ID AND PRIMARY KEY
     */
    @TableId("PLAN_ID")
    private Integer planId;

    /**
     * NAME OF THE PLAN
     */
    @TableField("PLAN_NAME")
    private String planName;

    /**
     * DETAILED PLAN STORED AT INSURANCE COMPANY
     */
    @TableField("PLAN_SUMMARY")
    private String planSummary;

    @TableField("PATIENT_ID")
    private Integer patientId;

    @TableField("COMPANY_ID")
    private Integer companyId;

    @TableField("TBL_CREATED_DT")
    private LocalDateTime tblCreatedDt;

    @TableField("TBL_LAST_DT")
    private LocalDateTime tblLastDt;


}
