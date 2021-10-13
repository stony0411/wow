package edu.nyu.wow.bo;

import lombok.Data;

/**
 * @Author: yw5211
 * @Date: 10/13/2021
 * @Email: yw5211@nyu.edu
 */

@Data
public class HospitalBo {

    /**
     * The name of the hospital
     */
    private String hospitalName;

    /**
     * The physical address of hospitals
     */
    private String addressLine1;

    /**
     * SECOND LINE ADDRESS
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
     * The zipcode of hospital
     */
    private Integer zipcode;

    /**
     * The phone number of the hospital
     */
    private Long mainContact;

    /**
     * The emergency contact of hospital
     */
    private Long emergencyHotline;

    /**
     * The specialty of this hospital
     */
    private String hospitalSpecialty;
}
