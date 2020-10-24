package com.med.services;

import com.med.interfaces.Course;
import org.springframework.stereotype.Component;

@Component
public class Api implements Course {

    @Override
    public void getTeachingHours() {
        System.out.println("Done");
    }
}
