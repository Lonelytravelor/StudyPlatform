package com.pandora.studyplatform.config;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CrosConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        //解决Vue与SpringBoot通信跨域问题
        registry.addMapping("/**")  //设置允许跨域的路径
                .allowedOrigins("*")          //设置允许跨域请求的域名
                .allowedMethods("GET","HEAD","POST","PUT","DELETE","OPTIONS")   //设置允许的方法
                .allowCredentials(false)       //这里：是否允许证书 不再默认开启
                .maxAge(3600)                 //跨域允许时间
                .allowedHeaders("*");
    }
}
