package edu.nyu.wow.dao.dto;

import lombok.Data;

import java.util.Date;

/**
 * @Author: sw3455
 * @Date: 2021/10/13
 * @Email: sw3455@nyu.edu
 */
@Data
public class PatientDto {

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
    private String zipcode;

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
    private Long insuranceProvider;

    /**
     * INSURANCE NUMBER OF THE PATIENT
     */
    private Long insuranceNumber;

}
