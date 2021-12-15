package edu.nyu.wow.dao.dto;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

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
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class RegistrationDto implements Serializable {

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

}
