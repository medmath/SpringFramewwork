package com.med.services;

import com.med.interfaces.Course;
import com.med.interfaces.ExtraSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Java implements Course {

    @Value("${instructor")
    private String instructorName;

    private ExtraSession extraSession;

    //@Autowired
    public Java(ExtraSession extraSession) {
        this.extraSession = extraSession;
    }

    @Override
    public int getTeachingHours() {
        return 8 + extraSession.getHour();
    }
}
