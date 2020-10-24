import interfaces.Mentor;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import services.FullTimeMentor;

public class CybertekApp {

    public static void main(String[] args) {
// we are gonna use XML Config... we addressed the xml file
        //BeanFactory container = new ClassPathXmlApplicationContext("config.xml");//

//Either use BeanFactory or ApplicationContext, but mostly ApplicationContext is used
        ApplicationContext container =new ClassPathXmlApplicationContext("config.xml");


        Mentor mentor = (Mentor)container.getBean("fullTimeMentor");//new FullTimeMentor();// instead of using new
// container.getBean(id from XML file), but it is complaining, returning an object, so we need to cast to change its reference type

        //Second way
        Mentor mentor2 =container.getBean("fullTimeMentor", Mentor.class);// it is a different way


        mentor.createAccount();


        Mentor mentor1 = (Mentor)container.getBean("partTimeMentor");
        mentor1.createAccount();

        mentor2.createAccount();

    }
}
