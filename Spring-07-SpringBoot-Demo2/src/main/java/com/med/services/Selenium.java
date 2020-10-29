package com.med.services;

import com.med.interfaces.Course;

public class Selenium implements Course {
    @Override
    public int getTeachingHours() {
        return 11;
    }
}
