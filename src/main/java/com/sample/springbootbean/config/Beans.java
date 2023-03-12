package com.sample.springbootbean.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class Beans {

    @Bean
    @Primary
    public DemoInterface getBeanOne() {
        return new DemoImplementationOne();
    }

    @Bean
    @Qualifier("BeanTwo")
    public DemoInterface getBeanTwo() {
        return new DemoImplementationTwo();
    }
}
