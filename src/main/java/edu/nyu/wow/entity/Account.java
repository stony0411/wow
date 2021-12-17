package edu.nyu.wow.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import java.util.Date;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

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
@TableName("ACCOUNT")
@Builder
public class Account implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * UNIQUE ID AND PRIMARY KEY
     */
    @TableId(value = "ACCOUNT_ID", type = IdType.AUTO)
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

    @TableField("USER_ID")
    private Long userId;

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

    @TableField("EMAIL")
    private String email;

    @TableField("QUESTION1")
    private String question1;

    @TableField("ANSWER1")
    private String answer1;

    @TableField("QUESTION2")
    private String question2;

    @TableField("ANSWER2")
    private String answer2;


}
