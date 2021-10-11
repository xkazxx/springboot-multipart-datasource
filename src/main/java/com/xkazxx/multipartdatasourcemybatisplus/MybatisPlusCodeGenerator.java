package com.xkazxx.multipartdatasourcemybatisplus;

import com.baomidou.mybatisplus.core.toolkit.StringPool;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.ConstVal;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.FileOutConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.TemplateConfig;
import com.baomidou.mybatisplus.generator.config.po.TableInfo;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


/**
 * Mybatis-Plus的代码生成器，用于生成pojo，mapper和service代码
 * <p>
 * 使用说明：配置好要处理的表和数据库连接信息后，直接运行main方法，无需启动项目
 */
public class MybatisPlusCodeGenerator {

  //下列数据库连接配置信息可根据本地开发环境修改
  private static final String dbUrl = "jdbc:mysql://localhost:3306/typicalcase?useUnicode=true&useSSL=false&characterEncoding=utf8&serverTimezone=Asia/Shanghai";
  private static final String dbDriver = "com.mysql.cj.jdbc.Driver";
  private static final String dbUser = "root";
  private static final String dbPassword = "1234";

  //罗列出需要生成代码的对应的数据库表名，这些表需要提前在上面连接的数据库创建好
  //注：已经执行过的同名表不会再重新生成
  private static final String[] tables = new String[]{
      "cb_typical_case"
  };

  /**
   * 配置好上述属性后，直接运行main方法即可
   *
   * @param args
   */
  public static void main(String[] args) {
    String projectPathss = System.getProperty("user.dir"); // 当前项目的根目录
    System.out.println(projectPathss);
    // 代码生成器
    AutoGenerator mpg = new AutoGenerator();

    // 全局配置
    GlobalConfig gc = new GlobalConfig();
    String projectPath = System.getProperty("user.dir");
    gc.setOutputDir(projectPath + "/src/main/java");
    // gc.setAuthor("jobob");
    gc.setOpen(false);
    gc.setServiceName("%sService");
    // gc.setSwagger2(true); 实体属性 Swagger2 注解
    mpg.setGlobalConfig(gc);

    // 数据源配置
    DataSourceConfig dsc = new DataSourceConfig();
    dsc.setUrl(dbUrl);
    // dsc.setSchemaName("public");
    dsc.setDriverName(dbDriver);
    dsc.setUsername(dbUser);
    dsc.setPassword(dbPassword);
    mpg.setDataSource(dsc);

    // 包配置
    PackageConfig pc = new PackageConfig();
    pc.setParent("com.xkazxx.springbootmultipartdatasource");
    pc.setEntity("entity");
    pc.setService("service");
    pc.setMapper("mapper");
    //设置不同类文件生成的路径
    HashMap<String, String> pathMap = new HashMap<>();
    pathMap.put(ConstVal.CONTROLLER, projectPath + "/src/main/java/com/xkazxx/springbootmultipartdatasource/controller");
    pathMap.put(ConstVal.XML, projectPath + "/src/main/resources/db/mapper");
    pathMap.put(ConstVal.MAPPER, projectPath + "/src/main/java/com/xkazxx/springbootmultipartdatasource/mapper");
    pathMap.put(ConstVal.ENTITY, projectPath + "/src/main/java/com/xkazxx/springbootmultipartdatasource/entity");
    pathMap.put(ConstVal.SERVICE, projectPath + "/src/main/java/com/xkazxx/springbootmultipartdatasource/service");
    pathMap.put(ConstVal.SERVICE_IMPL, projectPath + "/src/main/java/com/xkazxx/springbootmultipartdatasource/service/impl");
    pc.setPathInfo(pathMap);
    mpg.setPackageInfo(pc);

//    // 自定义配置
    InjectionConfig cfg = new InjectionConfig() {
      @Override
      public void initMap() {
        // to do nothing
      }
    };
    // 自定义输出配置
    List<FileOutConfig> focList = new ArrayList<>();
    focList.add(new FileOutConfig("/templates/entity.java.vm") {
      @Override
      public String outputFile(TableInfo tableInfo) {
        return projectPath + "/src/main/java/com/xkazxx/springbootmultipartdatasource/entity/" + pc.getModuleName()
                + "/" + tableInfo.getEntityName() + StringPool.DOT_JAVA;
      }
    });
    focList.add(new FileOutConfig("/templates/controller.java.vm") {
      @Override
      public String outputFile(TableInfo tableInfo) {
        return projectPath + "/src/main/java/com/xkazxx/springbootmultipartdatasource/controller/" + pc.getModuleName()
                + "/" + tableInfo.getEntityName() + "Controller" + StringPool.DOT_JAVA;
      }
    });
    // 自定义配置会被优先输出
    focList.add(new FileOutConfig("/templates/mapper.xml.vm") {
      @Override
      public String outputFile(TableInfo tableInfo) {
        return projectPath + "/src/main/resources/db/mapper/" + pc.getModuleName()
            + "/" + tableInfo.getEntityName() + "Mapper" + StringPool.DOT_XML;
      }
    });
    focList.add(new FileOutConfig("/templates/mapper.java.vm") {
      @Override
      public String outputFile(TableInfo tableInfo) {
        // 自定义输出文件名 ， 如果你 Entity 设置了前后缀、此处注意 xml 的名称会跟着发生变化！！
        return projectPath + "/src/main/java/com/xkazxx/springbootmultipartdatasource/mapper/" + pc.getModuleName()
            + "/" + tableInfo.getEntityName() + "Mapper" + StringPool.DOT_JAVA;
      }
    });
    focList.add(new FileOutConfig("/templates/service.java.vm") {
      @Override
      public String outputFile(TableInfo tableInfo) {
        return projectPath + "/src/main/java/com/xkazxx/springbootmultipartdatasource/service/" + pc.getModuleName()
            + "/" + tableInfo.getEntityName() + "Service" + StringPool.DOT_JAVA;
      }
    });
    focList.add(new FileOutConfig("/templates/serviceImpl.java.vm") {
      @Override
      public String outputFile(TableInfo tableInfo) {
        return projectPath + "/src/main/java/com/xkazxx/springbootmultipartdatasource/service/impl/" + pc.getModuleName()
            + "/" + tableInfo.getEntityName() + "ServiceImpl" + StringPool.DOT_JAVA;
      }
    });
    cfg.setFileOutConfigList(focList);
    mpg.setCfg(cfg);

    // 配置模板
    TemplateConfig templateConfig = new TemplateConfig();
    templateConfig.setXml(null);
    mpg.setTemplate(templateConfig);

    // 策略配置
    StrategyConfig strategy = new StrategyConfig();
    strategy.setNaming(NamingStrategy.underline_to_camel);
    strategy.setColumnNaming(NamingStrategy.underline_to_camel);
    strategy.setEntityLombokModel(true);
    //是否生成Controller
    strategy.setRestControllerStyle(true);
    strategy.setInclude(tables);
    strategy.setControllerMappingHyphenStyle(true);
    strategy.setTablePrefix(pc.getModuleName() + "_");
    mpg.setStrategy(strategy);
    mpg.execute();
  }

}