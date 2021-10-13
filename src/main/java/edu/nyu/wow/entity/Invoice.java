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
@TableName("INVOICE")
public class Invoice implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * invoice id and it is primay key
     */
    @TableId("INVOICE_ID")
    private Integer invoiceId;

    /**
     * THE TIME INVOICE GENERATED
     */
    @TableField("INVOICE_DATE")
    private LocalDateTime invoiceDate;

    /**
     * amount money due for LAB
     */
    @TableField("LABORATORY_COST")
    private BigDecimal laboratoryCost;

    /**
     * COST FOR PRESCRIPTION DRUGS
     */
    @TableField("PRESCRIPTION_DRUG_COST")
    private BigDecimal prescriptionDrugCost;

    /**
     * COST FOR SURGERY
     */
    @TableField("SURGERY_COST")
    private BigDecimal surgeryCost;

    /**
     * COST FOR BED IN HOSPITAL
     */
    @TableField("BED_USAGE_COST")
    private BigDecimal bedUsageCost;

    /**
     * THE TOTAL COST
     */
    @TableField("TOTAL_COST")
    private BigDecimal totalCost;

    /**
     * COST TO INSURANCE PROVIDER
     */
    @TableField("BILL_TO_INSURANCE")
    private BigDecimal billToInsurance;

    /**
     * THE COST COVERED BY PATIENT
     */
    @TableField("COST_TO_PATIENT")
    private BigDecimal costToPatient;

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

    @TableField("REG_ID")
    private Long regId;


}
