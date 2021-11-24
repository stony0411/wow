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
@TableName("PATIENT")
public class Patient implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * PRIMARY KEY AND UNIQUE ID FOR PATIENTS
     */
    @TableId("PATIENT_ID")
    private Integer patientId;

    /**
     * FIRST NAME OF PATIENT
     */
    @TableField("FNAME")
    private String fname;

    /**
     * PAITENT LASTNAME
     */
    @TableField("LNAME")
    private String lname;

    /**
     *  STREET
     */
    @TableField("ADDRESS_LINE_1")
    private String addressLine1;

    /**
     * APT/ROOM #
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
     * ZIPCODE
     */
    @TableField("ZIPCODE")
    private String zipcode;

    /**
     * PATIENT PHONE NUMBER
     */
    @TableField("MAIN_CONTACT")
    private Long mainContact;

    /**
     * BLOOD GROUP OF PATIENT
     */
    @TableField("BLOOD_TYPE")
    private String bloodType;

    /**
     * DATE OF BIRTH OF PATIENT IN FORM OF YYYY/MM/DD
     */
    @TableField("DOB")
    private String dob;

    /**
     * RACE OF THE PATIENT
     */
    @TableField("RACE")
    private String race;

    /**
     * MALE/FEMALE/NA
     */
    @TableField("GENDER")
    private String gender;

    /**
     * NAME OF INSURANCE PROVIDER OF PATIENT
     */
    @TableField("INSURANCE_PROVIDER")
    private Integer insuranceProvider;

    /**
     * INSURANCE NUMBER OF THE PATIENT
     */
    @TableField("INSURANCE_NUMBER")
    private BigDecimal insuranceNumber;

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
