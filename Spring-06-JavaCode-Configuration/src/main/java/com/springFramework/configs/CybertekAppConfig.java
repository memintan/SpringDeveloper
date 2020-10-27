package com.springFramework.configs;

import com.springFramework.interfaces.ExtraSessions;
import com.springFramework.services.Java;
import com.springFramework.services.OfficeHours;
import com.springFramework.services.Selenium;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.springFramework")
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
