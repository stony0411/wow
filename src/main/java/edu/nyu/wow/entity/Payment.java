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
@TableName("PAYMENT")
public class Payment implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * THE PAYMENT ID AND PRIMARY KEY
     */
    @TableId("PAYMENT_ID")
    private Integer paymentId;

    /**
     * payment amount
     */
    @TableField("PAYMENT_AMOUNT")
    private BigDecimal paymentAmount;

    /**
     * THE METHOD OF PAYMENT: CASH, CREDIT, DEBIT, PAYPAL, APPLE PAY, INSURANCE
     */
    @TableField("PAYMENT_METHOD")
    private String paymentMethod;

    /**
     * NAME OF CARD HOLDER OPTIONAL
     */
    @TableField("CARD_HOLDER_NAME")
    private String cardHolderName;

    /**
     * CARD NUMBER OPTIONAL
     */
    @TableField("CARD_NUMBER")
    private Long cardNumber;

    /**
     * CARD_EXPIRED_DATE
     */
    @TableField("CARD_EXPIRED_DATE")
    private LocalDateTime cardExpiredDate;

    /**
     * THE TIME PAYMENT MADE
     */
    @TableField("PAYMENT_DATE")
    private LocalDateTime paymentDate;

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

    @TableField("INVOICE_ID")
    private Integer invoiceId;


}
