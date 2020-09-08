package com.macro.mall.config;

import com.macro.mall.filter.MallFilter;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * MyBatis配置类
 * Created by macro on 2019/4/8.
 */
@Configuration
@EnableTransactionManagement
@MapperScan({"com.macro.mall.mapper","com.macro.mall.dao"})
public class MyBatisConfig {
    @Bean
    public FilterRegistrationBean<MallFilter> regist(){
        FilterRegistrationBean bean= new FilterRegistrationBean(new MallFilter());
        return bean;
    }
}
