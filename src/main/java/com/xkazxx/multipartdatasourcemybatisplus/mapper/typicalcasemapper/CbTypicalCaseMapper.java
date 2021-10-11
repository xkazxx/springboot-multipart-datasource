package com.xkazxx.multipartdatasourcemybatisplus.mapper.typicalcasemapper;

import com.xkazxx.multipartdatasourcemybatisplus.entity.CbTypicalCase;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author ${author}
 * @since 2021-10-11
 */
public interface CbTypicalCaseMapper extends BaseMapper<CbTypicalCase> {

  CbTypicalCase getInfoById(Integer id);
}
