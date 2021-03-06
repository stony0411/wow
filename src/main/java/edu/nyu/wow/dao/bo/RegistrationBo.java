package edu.nyu.wow.dao.bo;

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
 * @since 2021-12-16
 */
@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
public class RegistrationBo implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long regId;

    private Date regDate;

    private Date appointmentTime;

    private String symptoms;

    private Long deptNo;

    private Long patientId;

    private Date tblCreatedDt;

    private Date tblLastDt;

}
