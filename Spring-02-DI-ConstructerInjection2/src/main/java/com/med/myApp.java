package com.med;

import com.med.interfaces.Course;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class myApp {

    public static void main(String[] args) {

        ApplicationContext container =new ClassPathXmlApplicationContext("config.xml");
        Course course = (Course) container.getBean("java");// Course interfaceine baska bir classtan obje create ettik. bir nevi enjekte ettik
        course.getHours();



    }
}
