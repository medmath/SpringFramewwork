package com.med.services;

import com.med.interfaces.Course;


public class Java implements Course {


    OfficeHours officeHours;

    public Java(OfficeHours officeHours) {
        this.officeHours = officeHours;
    }


    @Override
    public void getTeachingHours() {
        System.out.println("Weekly Teaching Hours : " + (20 + officeHours.getHours()));
    }
}
