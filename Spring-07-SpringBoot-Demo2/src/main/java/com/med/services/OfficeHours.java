package com.med.services;

import com.med.interfaces.ExtraSessions;
import org.springframework.stereotype.Component;

@Component
public class OfficeHours implements ExtraSessions {

    @Override
    public int getExtraHours() {
        return 23;
    }
}
