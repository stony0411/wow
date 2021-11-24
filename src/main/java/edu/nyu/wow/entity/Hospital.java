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
@TableName("HOSPITAL")
public class Hospital implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * Hospital Primary key and ID
     */
    @TableId("HOSPITAL_ID")
    private Integer hospitalId;

    /**
     * The name of the hospital
     */
    @TableField("HOSPITAL_NAME")
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
    @TableField("CITY")
    private String city;

    /**
     * STATE
     */
    @TableField("STATE")
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
    private LocalDateTime tblCreatedDt;

    /**
     * LAST MODIFIED/UPDATED DATE
     */
    @TableField("TBL_LAST_DT")
    private LocalDateTime tblLastDt;


}
