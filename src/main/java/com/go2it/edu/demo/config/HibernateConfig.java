package com.go2it.edu.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
//@EnableTransactionManagement
@ImportResource({ "classpath:persistence.xml" })
public class HibernateConfig {
}
