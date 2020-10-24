package med.services;

import med.interfaces.ExtraSessions;
import org.springframework.stereotype.Component;


@Component
public class OfficeHours implements ExtraSessions {
    @Override
    public int getHours() {
        return 4;
    }
}
