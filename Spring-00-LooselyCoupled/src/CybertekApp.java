import implementation.Mentor;
import service.FullTimeMentor;
import service.MentorAccount;
import service.PartTimeMentor;

import java.util.Arrays;

public class CybertekApp {
    public static void main(String[] args) {

        //FullTimeMentor fullTime = new FullTimeMentor();
        PartTimeMentor partTime = new PartTimeMentor();

        MentorAccount mentor = new MentorAccount(partTime);
        mentor.manageAccount();



    }
}
