package edu.nyu.wow.entity;

import java.math.BigDecimal;
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
@TableName("ROOM")
public class Room implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * THE ROOM NUMBER
     */
    @TableId("ROOM_NUMBER")
    private Integer roomNumber;

    /**
     * NUMBER OF BEDS IN THIS ROOM
     */
    @TableField("CAPACITY")
    private BigDecimal capacity;

    /**
     * WHEHTER THIS ROOM IS HAS EMPTY BED
     */
    @TableField("AVAILABILITY")
    private String availability;

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
