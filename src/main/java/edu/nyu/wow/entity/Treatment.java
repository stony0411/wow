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
@TableName("TREATMENT")
public class Treatment implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("REG_ID")
    private Long regId;

    /**
     * PRIMARY KEY AND UNIQUE ID OF TREATMENT
     */
    @TableId("TREATMENT_ID")
    private Long treatmentId;

    /**
     * DISCRIMINATOR AND TYPE OF TREATMENT
     */
    @TableField("TREATMENT_TYPE")
    private String treatmentType;

    /**
     * THE STATUS OF CURRENT TREATMENT: COMPLETET/TERMINATED
     */
    @TableField("TREATMENT_STATUS")
    private String treatmentStatus;

    /**
     * THE DATETIME TREATMENT GENEREATED
     */
    @TableField("DATE")
    private LocalDateTime date;

    /**
     * THE DETAILED  DESCRIPTION OF TREATMENT
     */
    @TableField("DESCRIPTION")
    private String description;

    /**
     * FOLLOW UP FOR NEXT APPOINTMENT
     */
    @TableField("FOLLOW_UP_DATE")
    private LocalDateTime followUpDate;

    /**
     * THE START DATE FOR HOSPITALIZED
     */
    @TableField("HOSPITALIZED_START_DATE")
    private LocalDateTime hospitalizedStartDate;

    /**
     * THE DATE TO UNHOSPITALIZED
     */
    @TableField("DISCHARGE_DATE")
    private LocalDateTime dischargeDate;

    @TableField("BED_NUMBER")
    private Integer bedNumber;

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
