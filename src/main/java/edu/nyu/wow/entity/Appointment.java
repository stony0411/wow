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
@TableName("APPOINTMENT")
public class Appointment implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * THE PRIMARY KEY AND ID FOR APPOINTMENT
     */
    @TableId("APT_ID")
    private Integer aptId;

    /**
     * DATE FOR APT
     */
    @TableField("DATE")
    private LocalDateTime date;

    /**
     * SPECIFY THE TIME FOR THE APPOINTMENT
     */
    @TableField("TIMESLOT")
    private String timeslot;

    /**
     * DESCRIBE THE REASON FOR VISITING
     */
    @TableField("SYMPTOMS")
    private String symptoms;

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

    @TableField("REG_ID")
    private Long regId;


}
