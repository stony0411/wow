package edu.nyu.wow.dao.dto;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;
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
@NoArgsConstructor
@AllArgsConstructor
public class AppointmentDto implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * THE PRIMARY KEY AND ID FOR APPOINTMENT
     */
    private Long aptId;

    private Date appointmentTime;

    /**
     * SPECIFY THE TIME FOR THE APPOINTMENT
     */
    private String timeslot;

    /**
     * DESCRIBE THE REASON FOR VISITING
     */
    private String symptoms;

    private Long regId;

    private Long deptNo;

    private String hospitalName;

    private String deptName;

}
