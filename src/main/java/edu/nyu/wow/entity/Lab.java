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
@TableName("LAB")
public class Lab implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * NAME OF THE LAB
     */
    @TableField("LAB_NAME")
    private String labName;

    /**
     * PRIMARY KEY AND UNIQUE ID OF TREATMENT
     */
    @TableId("TREATMENT_ID")
    private Long treatmentId;

    /**
     * NAME OF THE TEST PERFORMED
     */
    @TableField("TEST_NAME")
    private String testName;

    /**
     * TYPE OF TEST PERFORMING
     */
    @TableField("TEST_TYPE")
    private String testType;

    /**
     * DATE FOR THE TEST
     */
    @TableField("TEST_DATE")
    private LocalDateTime testDate;

    /**
     * POSITIVE /NEGATIVE/ POTENTIAL RESULT
     */
    @TableField("TEST_RESULT")
    private String testResult;


}
