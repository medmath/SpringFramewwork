package com.med.services;

import com.med.interfaces.Course;
import org.springframework.stereotype.Component;

@Component
public class Java implements Course {


    private OfficeHours officeHours;

    public Java(OfficeHours officeHours) {
        this.officeHours = officeHours;
    }

    @Override
    public int getTeachingHours() {
        return 17 + officeHours.getExtraHours();
    }


}
