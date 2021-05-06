
public class Main {

	public static void main(String[] args) {
		
		Logger[] loggers = {new SmsLogger(),new DatabaseLogger()};
		
		CustomerManager customerManager = new CustomerManager(loggers);
		Customer engin = new Customer(1,"Engin","Demiroð");
		
		customerManager.add(engin);
	}

}
