package com.med.services;

import com.med.interfaces.Course;


public class Java implements Course {

    OfficeHours officeHours;


    public void getHours() {
        System.out.println("java hours is: "+15);//officeHours.getHours();
    }
}
