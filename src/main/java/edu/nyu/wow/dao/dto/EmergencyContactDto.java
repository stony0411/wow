package edu.nyu.wow.dao.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;

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
public class EmergencyContactDto implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long contactId;

    private String contactName;

    /**
     * THE NUMBER OFTHE EMERGENCY CONTACT PERSON
     */

    private Long contactNumber;

    /**
     * TYPE OF RELATIONSHIP WITH THE PATIENT
     */

    private String relation;


    private Long patientId;


}
