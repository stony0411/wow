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
@TableName("ACCOUNT")
public class Account implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * UNIQUE ID AND PRIMARY KEY
     */
    @TableId("ACCOUNT_ID")
    private Integer accountId;

    /**
     * NAME OF THE ACCOUNT
     */
    @TableField("ACCOUNT_NAME")
    private String accountName;

    /**
     * PW FOR THE ACCOUNT
     */
    @TableField("PASSWORD")
    private String password;

    @TableField("TYPE_ID")
    private Integer typeId;

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
