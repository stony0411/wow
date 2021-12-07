package edu.nyu.wow.entity;

import com.baomidou.mybatisplus.annotation.*;

import java.time.LocalDateTime;
import java.io.Serializable;
import java.util.Date;

import lombok.*;

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
@TableName("HOSPITAL")
@NoArgsConstructor
@AllArgsConstructor
public class Hospital implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * Hospital Primary key and ID
     */
    @TableId(value = "HOSPITAL_ID", type = IdType.AUTO)
    private Long hospitalId;

    /**
     * The name of the hospital
     */
    @TableField(value = "HOSPITAL_NAME", condition = "%s LIKE CONCAT(CONCAT('%%',#{%s}),'%%')")
    private String hospitalName;

    /**
     * The physical address of hospitals
     */
    @TableField("ADDRESS_LINE_1")
    private String addressLine1;

    /**
     * SECOND LINE ADDRESS
     */
    @TableField("ADDRESS_LINE_2")
    private String addressLine2;

    /**
     * CITY
     */
    @TableField(value = "CITY", condition = SqlCondition.EQUAL)
    private String city;

    /**
     * STATE
     */
    @TableField(value = "STATE", condition = SqlCondition.EQUAL)
    private String state;

    /**
     * The zipcode of hospital
     */
    @TableField("ZIPCODE")
    private String zipcode;

    /**
     * The phone number of the hospital
     */
    @TableField("MAIN_CONTACT")
    private Long mainContact;

    /**
     * The emergency contact of hospital
     */
    @TableField("EMERGENCY_HOTLINE")
    private Long emergencyHotline;

    /**
     * The specialty of this hospital
     */
    @TableField("HOSPITAL_SPECIALTY")
    private String hospitalSpecialty;

    /**
     * TIME TBL CREATED
     */
    @TableField("TBL_CREATED_DT")
    private Date tblCreatedDt;

    /**
     * LAST MODIFIED/UPDATED DATE
     */
    @TableField("TBL_LAST_DT")
    private Date tblLastDt;


}
