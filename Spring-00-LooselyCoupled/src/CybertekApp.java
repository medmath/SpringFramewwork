import implementation.Mentor;
import service.FullTimeMentor;
import service.MentorAccount;

public class CybertekApp {

    public static void main(String[] args) {
        FullTimeMentor fullTime = new FullTimeMentor();
        MentorAccount mentor1 = new MentorAccount(fullTime);
        mentor1.manageAccount();
    }
}
