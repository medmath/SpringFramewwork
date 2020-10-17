import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CybertekApp {

    public static void main(String[] args) {
// we are gonna use XML Config... we addressed the xml file
        BeanFactory container = new ClassPathXmlApplicationContext("config.xml");//

    }
}
