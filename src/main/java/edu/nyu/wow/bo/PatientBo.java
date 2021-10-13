package edu.nyu.wow.bo;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * @Author: sw3455
 * @Date: 2021/10/13
 * @Email: sw3455@nyu.edu
 */
@Data
public class PatientBo {
    /**
     * PRIMARY KEY AND UNIQUE ID FOR PATIENTS
     */
    private Integer patientId;

    /**
     * FIRST NAME OF PATIENT
     */
    private String fname;

    /**
     * PAITENT LASTNAME
     */
    private String lname;

    /**
     *  STREET
     */
    private String addressLine1;

    /**
     * APT/ROOM #
     */
    private String addressLine2;

    /**
     * CITY
     */
    private String city;

    /**
     * STATE
     */
    private String state;

    /**
     * ZIPCODE
     */
    private Integer zipcode;

    /**
     * PATIENT PHONE NUMBER
     */
    private Long mainContact;

    /**
     * BLOOD GROUP OF PATIENT
     */
    private String bloodType;

    /**
     * DATE OF BIRTH OF PATIENT IN FORM OF YYYY/MM/DD
     */
    private String dob;

    /**
     * RACE OF THE PATIENT
     */
    private String race;

    /**
     * MALE/FEMALE/NA
     */
    private String gender;

    /**
     * NAME OF INSURANCE PROVIDER OF PATIENT
     */
    private String insuranceProvider;

    /**
     * INSURANCE NUMBER OF THE PATIENT
     */
    private Long insuranceNumber;

    /**
     * TIME TBL CREATED
     */
    private LocalDateTime tblCreatedDt;

    /**
     * LAST MODIFIED/UPDATED DATE
     */
    private LocalDateTime tblLastDt;
}
