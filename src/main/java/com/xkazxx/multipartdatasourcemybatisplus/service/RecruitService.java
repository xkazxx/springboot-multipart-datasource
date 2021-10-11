package com.xkazxx.multipartdatasourcemybatisplus.service;

import com.xkazxx.multipartdatasourcemybatisplus.entity.Recruit;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 招募人员表 服务类
 * </p>
 *
 * @author ${author}
 * @since 2021-10-11
 */
public interface RecruitService extends IService<Recruit> {

  Recruit getByIdss(int id);
}
