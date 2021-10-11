package com.xkazxx.multipartdatasourcemybatisplus.controller;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.xkazxx.multipartdatasourcemybatisplus.entity.CbTypicalCase;
import com.xkazxx.multipartdatasourcemybatisplus.service.CbTypicalCaseService;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedHashMap;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author ${author}
 * @since 2021-10-11
 */
@RestController
@RequestMapping("/cb-typical-case")
@AllArgsConstructor
public class CbTypicalCaseController {

  private final CbTypicalCaseService cbTypicalCaseService;


  @GetMapping("/get/{id}")
  public CbTypicalCase getRecruitById(@PathVariable Integer id){
   return cbTypicalCaseService.getById(id);
  }
  @GetMapping("/info/{id}")
  public CbTypicalCase infoRecruitById(@PathVariable Integer id){
   return cbTypicalCaseService.getInfoById(id);
  }

  @RequestMapping("/")
  @SneakyThrows
  public LinkedHashMap<Integer, Integer> home() {
    LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
    map.put(1,10);
    map.put(3,30);
    map.put(7,70);
    map.put(5,50);
    map.put(4,40);
    map.put(9,90);
    System.out.println(map);
    System.out.println("-----------------");
    System.out.println(new ObjectMapper().writeValueAsString(map));
    return map;
  }
}

