package bai2.model;

import java.util.Scanner;

public class Product {
	private int price;
	private Category category;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}
	
	public Product(int price, Category category) {
		super();
//		this.price = price;
//		this.category = category;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
	
	//input
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter price: ");
		this.setPrice(sc.nextInt());
		
	}
	
	//info
	public void info() {
		System.out.println("------------");
		System.out.println("Price: " + price);
	}
}
