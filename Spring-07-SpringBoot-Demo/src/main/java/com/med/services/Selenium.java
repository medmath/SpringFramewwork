package com.med.services;

import com.med.interfaces.Course;
import org.springframework.stereotype.Component;

@Component
public class Selenium implements Course {

    OfficeHours officeHours;

    public Selenium(OfficeHours officeHours) {
        this.officeHours = officeHours;
    }

    @Override
    public int getTeachingHours() {
        return 5 +officeHours.getHour();
    }
}
