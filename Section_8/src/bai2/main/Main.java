package bai2.main;

import java.util.Scanner;

import bai2.model.Category;
import bai2.model.Product;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Category category = new Category();
		category.input();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n-product: ");
		int n = sc.nextInt();
		
		Product[] products = new Product[n];
		for(int i = 0; i < products.length; i++) {
			products[i] = new Product();
			products[i].input();
			products[i].setCategory(category);
		}
		
		for(Product product : products) {
			product.info();
			product.getCategory().info();
		}
	}

}
