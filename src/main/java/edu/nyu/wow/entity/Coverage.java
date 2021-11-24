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
 * @since 2021-11-24
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("COVERAGE")
public class Coverage implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID AND PRIMARY KEY FOR INSURANCE COVERAGE
     */
    @TableId("COVERAGE_ID")
    private Integer coverageId;

    /**
     * NAME OF THE COVERED SUBJECT
     */
    @TableField("COVERAGE_NAME")
    private String coverageName;

    /**
     * THE AMOUNT COVERED BY THIS INSURANCE
     */
    @TableField("AMOUNT_COVERD")
    private BigDecimal amountCoverd;

    @TableField("COMPANY_ID")
    private Integer companyId;

    @TableField("PAYMENT_ID")
    private Integer paymentId;

    /**
     * DATE TABLE CREATED
     */
    @TableField("TBL_CREATED_DT")
    private LocalDateTime tblCreatedDt;

    /**
     * DATE TABLE LAST UPDATED
     */
    @TableField("TBL_LAST_DT")
    private LocalDateTime tblLastDt;


}
