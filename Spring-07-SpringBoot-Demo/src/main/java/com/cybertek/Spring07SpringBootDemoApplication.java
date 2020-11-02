package com.cybertek;

import com.cybertek.interfaces.Course;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Spring07SpringBootDemoApplication {

	public static void main(String[] args) {

		ApplicationContext container = SpringApplication.run(Spring07SpringBootDemoApplication.class, args); //creates containers and all beans
		Course course = container.getBean("java", Course.class);
		course.getTeachingHours();

		System.out.println("course.getTeachingHours() = " + course.getTeachingHours());
	}

}
