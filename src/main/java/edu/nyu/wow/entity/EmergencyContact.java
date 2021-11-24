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
@TableName("EMERGENCY_CONTACT")
public class EmergencyContact implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * THE PRIMARY KEY AND UNIQUE ID FOR PATIENTS EMERGENCY CONTACT
     */
    @TableId("CONTACT_ID")
    private Integer contactId;

    @TableField("CONTACT_NAME")
    private String contactName;

    /**
     * THE NUMBER OFTHE EMERGENCY CONTACT PERSON
     */
    @TableField("CONTACT_NUMBER")
    private Long contactNumber;

    /**
     * TYPE OF RELATIONSHIP WITH THE PATIENT
     */
    @TableField("RELATION")
    private String relation;

    @TableField("PATIENT_ID")
    private Integer patientId;

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
