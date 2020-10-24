import com.med.configs.MedAppConfig;
import com.med.interfaces.Course;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class myApp {

    public static void main(String[] args) {
//        ApplicationContext container = new ClassPathXmlApplicationContext("config.xml");
//
//        Course course = container.getBean("java",Course.class);
//
//        course.getTeachingHours();

        ApplicationContext container = new AnnotationConfigApplicationContext(MedAppConfig.class);//config file added

        Course course =container.getBean("java", Course.class);

        course.getTeachingHours();



    }
}
