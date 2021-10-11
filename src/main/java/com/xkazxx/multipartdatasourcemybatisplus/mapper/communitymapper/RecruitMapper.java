package com.xkazxx.multipartdatasourcemybatisplus.mapper.communitymapper;

import com.xkazxx.multipartdatasourcemybatisplus.entity.Recruit;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 * 招募人员表 Mapper 接口
 * </p>
 *
 * @author ${author}
 * @since 2021-10-11
 */
public interface RecruitMapper extends BaseMapper<Recruit> {

  Recruit getByIdss(int id);
}
