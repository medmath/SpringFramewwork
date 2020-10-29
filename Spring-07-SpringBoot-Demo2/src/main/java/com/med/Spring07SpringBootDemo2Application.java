package com.med;

import com.med.interfaces.Course;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Spring07SpringBootDemo2Application {

	public static void main(String[] args) {


		ApplicationContext container = SpringApplication.run(Spring07SpringBootDemo2Application.class, args);
		Course course = container.getBean("java", Course.class);
		System.out.println(course.getTeachingHours());

	}

}
