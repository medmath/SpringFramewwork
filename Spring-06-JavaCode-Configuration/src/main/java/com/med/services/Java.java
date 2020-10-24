package com.med.services;

import com.med.interfaces.Course;
import com.med.interfaces.ExtraSessions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Java implements Course {

//    @Autowired
//    @Qualifier("officeHours")//field injection
    private ExtraSessions extraSessions;

    @Autowired     //Constructer Injection
    public Java(@Qualifier("mockInterviewHours") ExtraSessions extraSessions) {
        this.extraSessions = extraSessions;
    }


    @Override
    public void getTeachingHours() {
        System.out.println("Wekkly teaching hours: 30");
    }
}
