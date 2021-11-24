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
@TableName("SURGERY")
public class Surgery implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * PRIMARY KEY AND UNIQUE ID OF TREATMENT
     */
    @TableId("TREATMENT_ID")
    private Long treatmentId;

    /**
     * NAME OF THE SURGERY
     */
    @TableField("SURGERY_NAME")
    private String surgeryName;

    /**
     * THE DESCRIPTION OF SURGERY
     */
    @TableField("DESCRIPTION")
    private String description;

    /**
     * THE DATE OF SURGERY
     */
    @TableField("SURGERY_DATE")
    private LocalDateTime surgeryDate;

    /**
     * THE RESULT OF THE SURGERY, SUCCESS OR NOT
     */
    @TableField("RESULT")
    private String result;


}
