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
@TableName("DISEASE")
public class Disease implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID code of disease internationally
     */
    @TableId("ICD_CODE")
    private Float icdCode;

    /**
     * Name of the disease
     */
    @TableField("DISEASE_NAME")
    private String diseaseName;

    /**
     * THE TYPE OF DISEASE
     */
    @TableField("DISEASE_TYPE")
    private String diseaseType;

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
