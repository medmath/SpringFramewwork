package com.med.services;

import com.med.interfaces.Course;
import com.med.interfaces.ExtraSessions;

public class OfficeHours implements ExtraSessions {
    @Override
    public int getHours() {
        return 5;
    }
}
