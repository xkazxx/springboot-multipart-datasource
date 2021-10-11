package com.xkazxx.multipartdatasourcemybatisplus.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import java.util.Date;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 招募人员表
 * </p>
 *
 * @author ${author}
 * @since 2021-10-11
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Recruit implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 置顶标志
     */
    private Boolean top;

    /**
     * 标题
     */
    private String title;

    /**
     * 招聘人员数量
     */
    private Integer quantity;

    /**
     * 招募截止时间
     */
    private Date endAt;

    /**
     * 描述
     */
    private String info;

    /**
     * 审批原因
     */
    private String auditReason;

    /**
     * 状态
     */
    private Integer status;

    /**
     * 审核通过时间
     */
    private Date auditPassAt;

    /**
     * 发布申请人
     */
    private String publishName;

    private Integer userId;

    private Integer companyId;

    private Date createAt;

    private Date updateAt;

    /**
     * 更新乐观锁
     */
    private Integer version;

    /**
     * 总价
     */
    private Double price;

    /**
     * 报名截止时间
     */
    private Date joinEndAt;

    /**
     * 删除时间
     */
    private Date deleteAt;

    /**
     * 报名人数
     */
    private Integer userQuantity;

    /**
     * 选中报名人数
     */
    private Integer selectedQuantity;

    /**
     * 联系方式
     */
    private String contactPhone;

    /**
     * 是否已读
     */
    private Boolean isRead;

    /**
     * 同步时间
     */
    private Date syncAt;


}
