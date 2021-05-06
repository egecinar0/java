package oopIntro;

public class Main {

	public static void main(String[] args) {
		
		Product product1 = new Product();
		
		product1.setId(1);
		product1.setName("Lenevo V14");
		product1.setDetail("16 GB Ram");
		product1.setDiscount(10);
		product1.setUnitPrice(15000);
		
		Product product2 = new Product();
		
		product2.setId(2);
		product2.setName("Lenevo V15");
		product2.setDetail("32 GB Ram");
		product2.setDiscount(7);
		product2.setUnitPrice(16000);
		
		Product product3 = new Product();
		
		product3.setId(3);
		product3.setName("Hp5");
		product3.setDetail("8 GB Ram");
		product3.setDiscount(5);
		product3.setUnitPrice(10000);
		System.out.println(product1.getUnitPriceAfterDiscount());
		
		
		
		
	
		
		
		Category category1 = new Category();
		category1.id = 1;
		category1.name = "Bilgisayar";
		
		Category category2 = new Category();
		category2.id = 2;
		category2.name = "Ev/Bahçe";
		
		
		ProductManager productManager = new ProductManager();
		productManager.addToCart(product1);
		

		
		
		
		
		
	}

}
