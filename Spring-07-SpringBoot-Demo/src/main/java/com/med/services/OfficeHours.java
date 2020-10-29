package com.med.services;

import com.med.interfaces.ExtraSession;
import org.springframework.stereotype.Component;

@Component
public class OfficeHours implements ExtraSession {
    @Override
    public int getHour() {
        return 7;
    }
}
