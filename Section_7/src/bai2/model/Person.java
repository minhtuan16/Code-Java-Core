package bai2.model;

import java.util.Scanner;

public class Person {
	private int id;
	private String name;
	private int age;
	
	//constructor
	public Person() {
		
	}
	public Person(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void input() {
		System.out.println("Nhap thong tin:");
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Nhap id:");
		id = sc1.nextInt();
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Nhap ten: ");
		name = sc2.nextLine();
		
		Scanner sc3 = new Scanner(System.in);
		System.out.println("Nhap tuoi: ");
		age = sc3.nextInt();
	}
	
	public void info() {
		System.out.println("ID: " + id + " | " + "Ten: " + name + " | " + "Tuoi: " + age);
	}
}
