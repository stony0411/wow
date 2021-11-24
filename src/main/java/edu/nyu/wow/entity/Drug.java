package edu.nyu.wow.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
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
@TableName("DRUG")
public class Drug implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * PRIMARY KEY AND UNIQUE ID OF TREATMENT
     */
    @TableId("TREATMENT_ID")
    private Integer treatmentId;

    /**
     * NAME OF THE DRUG
     */
    @TableField("DRUG_NAME")
    private String drugName;

    /**
     * THE DOSE OF THE DRUG
     */
    @TableField("DOSE")
    private String dose;


}
