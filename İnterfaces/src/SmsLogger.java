
public class SmsLogger implements Logger{

	@Override
	public void log(String massage) {
		
		System.out.println("Sms gönderildi : "+massage);
		
	}

}
