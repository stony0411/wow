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
@TableName("SURGERY")
public class Surgery implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * NAME OF THE SURGERY
     */
    @TableField("SURGERY_NAME")
    private String surgeryName;

    /**
     * PRIMARY KEY AND UNIQUE ID OF TREATMENT
     */
    @TableId("TREATMENT_ID")
    private Long treatmentId;

    /**
     * THE DESCRIPTION OF SURGERY
     */
    @TableField("SURGERY_DESCRIPTION")
    private String surgeryDescription;

    /**
     * THE DATE OF SURGERY
     */
    @TableField("SURGERY_DATE")
    private LocalDateTime surgeryDate;

    /**
     * THE RESULT OF THE SURGERY, SUCCESS OR NOT
     */
    @TableField("SURGERY_RESULT")
    private String surgeryResult;


}
