public class SmsService {

    private final SmsProvider smsProvider;


    public SmsService(SmsProvider smsProvider){

        this.smsProvider=smsProvider;

    }

    public void sendSms(int phoneNumber, String message) {
        smsProvider.sendSms(phoneNumber, message);

    }



}
