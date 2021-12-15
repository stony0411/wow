
package edu.nyu.wow.dao.vo;

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
 * @since 2021-12-15
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class AppointmentVo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * THE PRIMARY KEY AND ID FOR APPOINTMENT
     */
    private Integer aptId;

    private Date appointmentTime;

    /**
     * SPECIFY THE TIME FOR THE APPOINTMENT
     */
    private String timeslot;

    /**
     * DESCRIBE THE REASON FOR VISITING
     */
    private String symptoms;

    private Long deptNo;

}
