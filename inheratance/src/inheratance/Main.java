package inheratance;

public class Main {

	public static void main(String[] args) {
		ÝndividualCustomer engin = new ÝndividualCustomer();
		engin.customerNumber = "12345";
		
		CorporateCustomer hepsiBurada = new CorporateCustomer();
		hepsiBurada.customerNumber = "78910";
		
		CustomerManager customerManager = new CustomerManager();
		customerManager.add(hepsiBurada);
		customerManager.add(engin);

	}

}
