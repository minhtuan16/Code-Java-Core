package bai2;

import java.util.Scanner;

public class ProductServiceIMPL implements ProductService  {

	@Override
	public void input(Product product) {
		
		System.out.println("Enter id: ");
		product.setId(new Scanner(System.in).nextInt());
		
		System.out.println("Enter name: ");
		product.setName(new Scanner(System.in).nextLine());
		
		System.out.println("Enter price: ");
		product.setPrice(new Scanner(System.in).nextDouble());
	}

	@Override
	public void info(Product product) {

		System.out.println("-------------------");
		System.out.println("ID: " + product.getId());
		System.out.println("Name: " + product.getName());
		System.out.println("Price: " + product.getPrice());
	}

	@Override
	public Product[] inputList() {
		System.out.println("Enter n-product:");
		int n = new Scanner(System.in).nextInt();
		
		Product[] products = new Product[n];
		ProductServiceIMPL productServiceIMPL = new ProductServiceIMPL();
		for(int i = 0; i < products.length; i++) {
			
			products[i] = new Product();
			productServiceIMPL.input(products[i]);
		}
		return products;

	}

	@Override
	public void infoList(Product[] products) {
		ProductServiceIMPL productServiceIMPL = new ProductServiceIMPL();
		
		for(Product pro : products) {
			productServiceIMPL.info(pro);
		}
	}

}
