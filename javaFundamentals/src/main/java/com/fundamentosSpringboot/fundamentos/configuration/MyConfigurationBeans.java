package com.fundamentosSpringboot.fundamentos.configuration;

import com.fundamentosSpringboot.fundamentos.bean.MyBean;
import com.fundamentosSpringboot.fundamentos.bean.MyBeanImplement;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfigurationBeans {
    @Bean
    public MyBean beanOperation(){
        return new MyBeanImplement();
    }
}
