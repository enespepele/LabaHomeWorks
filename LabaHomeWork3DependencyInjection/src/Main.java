
public class Main {
    public static void main(String[] args) {
        // Sms sağlayıcı seçimi
        SmsProvider smsProvider = new TwilioSmsProvider();
        SmsProvider smsProvider1 = new NexmoSmsProvider();
        // SmsService'in oluşturulması
        SmsService smsService = new SmsService(smsProvider);
        SmsService smsService1=new SmsService(smsProvider1);
        // Sms gönderme
        smsService.sendSms(543996,"Bugün buluşalım mı?");
        smsService1.sendSms(1566,"Olur nerede?");




    }
    }
