package com.springFramework.configs;

import com.springFramework.interfaces.ExtraSessions;
import com.springFramework.services.Java;
import com.springFramework.services.OfficeHours;
import com.springFramework.services.Selenium;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.springFramework")
@PropertySource("classpath:application.properties")
public class CybertekAppConfig {


    @Bean
    public Java java(){
        return new Java(extraSessions());
    }

    @Bean
    public Selenium selenium(){
        return new Selenium();
    }

    /*
    public OfficeHours officeHours(){
        return new OfficeHours();
    }

     */
    @Bean
    public ExtraSessions extraSessions(){
        return new OfficeHours();
    }


}
