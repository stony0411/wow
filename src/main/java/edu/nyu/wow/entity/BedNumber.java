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
@TableName("BED_NUMBER")
public class BedNumber implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * BED ID AND PRIMARY KEY
     */
    @TableId("BED_NUMBER")
    private Integer bedNumber;

    /**
     * FLOOR OF THE BED
     */
    @TableField("FLOOR")
    private String floor;

    @TableField("ROOM_NUMBER")
    private Integer roomNumber;

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
