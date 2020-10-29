package springFramework.services;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import springFramework.interfaces.Course;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Arrays;

@Component
public class Java implements Course {

    @Override
    public void getTeachingHours() {
        System.out.println("Weekly teaching hours: 30");
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("Executing post construct");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("Executing pre destroy");
    }
}
