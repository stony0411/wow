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
@TableName("INSURANCE_COMPANY")
public class InsuranceCompany implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID AND PRIMARY KEY OF INSURANCE COMPANY
     */
    @TableId("COMPANY_ID")
    private Integer companyId;

    /**
     * THE NAME OF THE COMPANY
     */
    @TableField("COMPANY_NAME")
    private String companyName;

    @TableField("PATIENT_ID")
    private Integer patientId;

    /**
     * DATE TABLE CREATED
     */
    @TableField("TBL_CREATED_DT")
    private LocalDateTime tblCreatedDt;

    /**
     * THE DATE TABLE LAST UPDATED
     */
    @TableField("TBL_LAST_DT")
    private LocalDateTime tblLastDt;


}
