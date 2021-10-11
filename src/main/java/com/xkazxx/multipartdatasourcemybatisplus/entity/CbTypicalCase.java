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
 * 
 * </p>
 *
 * @author ${author}
 * @since 2021-10-11
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class CbTypicalCase implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private Date createAt;

    private Date deleteAt;

    /**
     * 项目ID，做数据隔离用，CRUD时需要带上此条件
     */
    private Long projectId;

    private Date updateAt;

    /**
     * 创建人ID，暂时只是记录一下，没有实际用处
     */
    private Long userId;

    /**
     * 案件地址
     */
    private String address;

    /**
     * 案件编号
     */
    private Long code;

    /**
     * 描述
     */
    private String description;

    /**
     * 点位，单选
     */
    private String dianwei;

    /**
     * 指标，单选，用英文逗号拼接存储多级指标选项值
     */
    private String indicator;

    /**
     * 照片，用英文逗号拼接存储多张图片的oss下载地址
     */
    private String photo;

    /**
     * 列表排序，初始值就是id值
     */
    private Long ranks;

    /**
     * 发生道路，单选，用英文逗号拼接存储多级道路选项值
     */
    private String road;

    /**
     * 案件来源，单选
     */
    private String source;

    /**
     * 置顶时间，null-该案件未置顶
     */
    private Date topAt;


}
