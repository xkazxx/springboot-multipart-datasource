package com.xkazxx.multipartdatasourcemybatisplus.service.impl;

import com.xkazxx.multipartdatasourcemybatisplus.entity.CbTypicalCase;
import com.xkazxx.multipartdatasourcemybatisplus.mapper.typicalcasemapper.CbTypicalCaseMapper;
import com.xkazxx.multipartdatasourcemybatisplus.service.CbTypicalCaseService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ${author}
 * @since 2021-10-11
 */
@Service
public class CbTypicalCaseServiceImpl extends ServiceImpl<CbTypicalCaseMapper, CbTypicalCase> implements CbTypicalCaseService {

  @Autowired
  private CbTypicalCaseMapper cbTypicalCaseMapper;
  @Override
  public CbTypicalCase getInfoById(Integer id) {
    return cbTypicalCaseMapper.getInfoById(id);
  }
}
