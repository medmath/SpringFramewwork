package com.med.services;

import com.med.interfaces.Course;
import com.med.interfaces.ExtraSessions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Selenium implements Course {

    private ExtraSessions extraSessions1;

    @Autowired
    public Selenium(@Qualifier("officeHours") ExtraSessions extraSessions1) {
        this.extraSessions1 = extraSessions1;
    }

    @Override
    public void getTeachingHours() {
        System.out.println("Wekkly teaching hours: 45");
    }
}
