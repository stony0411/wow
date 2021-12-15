package edu.nyu.wow.dao.bo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author MyBatisPlusGenerator
 * @since 2021-12-15
 */
@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
public class RegistrationBo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * THE PRIMARY KEY AND UNIQUE ID OF REGISTRATION
     */
    private Long regId;

    /**
     * THE DATETIME OF REGISTRATION
     */
    private Date regDate;

    private Long patientId;

    /**
     * TIME TBL CREATED
     */
    private Date tblCreatedDt;

    /**
     * LAST MODIFIED/UPDATED DATE
     */
    private Date tblLastDt;


}
