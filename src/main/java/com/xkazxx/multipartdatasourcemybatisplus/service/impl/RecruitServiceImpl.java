package com.xkazxx.multipartdatasourcemybatisplus.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.xkazxx.multipartdatasourcemybatisplus.entity.Recruit;
import com.xkazxx.multipartdatasourcemybatisplus.mapper.communitymapper.RecruitMapper;
import com.xkazxx.multipartdatasourcemybatisplus.service.RecruitService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 招募人员表 服务实现类
 * </p>
 *
 * @author ${author}
 * @since 2021-10-11
 */
@Service
@DS("slaver") // slaver分组选一个数据源使用，也可以指定分组中的具体一个：@DS("slaver_1")
public class RecruitServiceImpl extends ServiceImpl<RecruitMapper, Recruit> implements RecruitService {
  @Autowired
  private RecruitMapper mapper;

  @Override
  public Recruit getByIdss(int id) {
    return mapper.getByIdss(id);
  }
}
