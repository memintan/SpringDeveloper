package springFramework;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import springFramework.config.CybertekAppConfig;
import springFramework.interfaces.Course;

public class CybertekApp {
    public static void main(String[] args) {
        ApplicationContext container = new AnnotationConfigApplicationContext(CybertekAppConfig.class);
        Course course = container.getBean("java", Course.class);

        course.getTeachingHours();

        ((AnnotationConfigApplicationContext)container).close();

    }
}
