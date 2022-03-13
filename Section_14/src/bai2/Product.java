package bai2;

import java.io.Serializable;
import java.util.Scanner;

public class Product implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private double price;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
//	public void input() {
//		
//		System.out.println("Enter id: ");
//		this.setId(new Scanner(System.in).nextInt());
//		
//		System.out.println("Enter name: ");
//		this.setName(new Scanner(System.in).nextLine());
//		
//		System.out.println("Enter price: ");
//		this.setPrice(new Scanner(System.in).nextDouble());
//	}
//	
//	public void info() {
//		
//		System.out.println("-------------");
//		System.out.println("ID: " + this.id);
//		System.out.println("Name: " + this.name);
//		System.out.println("Price: " + this.price);
//	}
}
