public class NexmoSmsProvider implements SmsProvider {
    @Override
    public void sendSms(int phoneNumber, String message) {
        System.out.println("Nexmo'dan "+" -> "+phoneNumber+" numarasına "+"---"+message+"---"+"Gönderildi");
    }
}
