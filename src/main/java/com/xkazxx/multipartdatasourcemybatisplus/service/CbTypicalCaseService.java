package com.xkazxx.multipartdatasourcemybatisplus.service;

import com.xkazxx.multipartdatasourcemybatisplus.entity.CbTypicalCase;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author ${author}
 * @since 2021-10-11
 */
public interface CbTypicalCaseService extends IService<CbTypicalCase> {

  CbTypicalCase getInfoById(Integer id);
}
