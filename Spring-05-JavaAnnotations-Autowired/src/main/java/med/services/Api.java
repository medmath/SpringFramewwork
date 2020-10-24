package med.services;

//import com.med.interfaces.Course;
import med.interfaces.Course;
import org.springframework.stereotype.Component;

@Component
public class Api implements Course {

    @Override
    public void getTeachingHours() {
        System.out.println("Done");
    }
}
