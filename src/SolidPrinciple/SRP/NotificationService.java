package SolidPrinciple.SRP;

public class NotificationService {

    public int sendOTP(String medium){
        if(medium.equals("phone")){
            // write email related logic
            // use JavaMailSenderAPI
            return 33245;
        }
        return -1;
    }
}
