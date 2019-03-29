package cn.xiaonixn00.controller;

import cn.xiaonixn00.service.LeadingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.Map;


/**
 * @author 荣恒 xiaonixn00
 * @packageName cn.xiaonixn00.controller
 * @className DefaultView
 * @date 2019/3/6 16:35
 * 调转方法,访问域名跳转index页面
 */
@Configuration
public class DefaultView implements WebMvcConfigurer {

    //    @Override
//    public void addViewControllers(ViewControllerRegistry registry) {
//        registry.addViewController("/index").setViewName("index");
//
//    }
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**").allowedOrigins("*")
                .allowedMethods("GET", "HEAD", "POST", "PUT", "DELETE", "OPTIONS")
                .allowCredentials(false).maxAge(3600);
    }

}