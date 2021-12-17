package edu.nyu.wow.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import java.util.Date;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Value;

/**
 * <p>
 * 
 * </p>
 *
 * @author MyBatisPlusGenerator
 * @since 2021-12-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("EMERGENCY_CONTACT")
public class EmergencyContact implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * THE PRIMARY KEY AND UNIQUE ID FOR PATIENTS EMERGENCY CONTACT
     */
    @TableId(value = "CONTACT_ID", type = IdType.AUTO)
    private Long contactId;

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
    private Long patientId;

    /**
     * TIME TBL CREATED
     */
    @TableField("TBL_CREATED_DT")
    private Date tblCreatedDt;

    /**
     * LAST MODIFIED/UPDATED DATE
     */
    @TableField("TBL_LAST_DT")
    private Date tblLastDt;

    @TableField("IS_DELETED")
    private Integer isDeleted;


}
