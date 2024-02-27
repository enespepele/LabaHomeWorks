public class TwilioSmsProvider implements SmsProvider{
    @Override
    public void sendSms(int phoneNumber, String message) {
        System.out.println("Twilio'dan "+" -> "+phoneNumber+" numarasına "+"---"+message+"---"+"Gönderildi");

    }
}
