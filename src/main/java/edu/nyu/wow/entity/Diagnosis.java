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
@TableName("DIAGNOSIS")
public class Diagnosis implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID AND PRIMARY KEY
     */
    @TableId("DIAGNOSIS_ID")
    private Integer diagnosisId;

    /**
     * DATE DIAGNOSIS GENERATED
     */
    @TableField("DIAGNOSIS_DATE")
    private LocalDateTime diagnosisDate;

    @TableField("DISEASE_ICD_CODE")
    private Float diseaseIcdCode;

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

    @TableField("CONSULTING_DOC_ID")
    private Integer consultingDocId;

    @TableField("FULLTIME_DOC_ID")
    private Integer fulltimeDocId;

    @TableField("TREATMENT_ID")
    private Long treatmentId;


}
