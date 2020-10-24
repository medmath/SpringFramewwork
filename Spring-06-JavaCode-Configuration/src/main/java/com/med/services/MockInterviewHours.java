package com.med.services;

import com.med.interfaces.ExtraSessions;
import org.springframework.stereotype.Component;


@Component
public class MockInterviewHours implements ExtraSessions {
    @Override
    public int getOfficeHours() {
        return 3;
    }
}
