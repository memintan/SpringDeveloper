package springFramework.services;


import org.springframework.stereotype.Component;
import springFramework.interfaces.Course;

@Component
public class Selenium implements Course {
    @Override
    public void getTeachingHours() {
        System.out.println("Weekly teaching hour: 23");
    }
}
