package bai2.model;

import java.util.Scanner;

public class Student {
	int id;
	String name;
	String address;
	String major;
	
	public Student() {
		
	}
	public Student(int id, String name, String address, String major) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.major = major;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
	//ham input
	public void input() {
		
		System.out.println("Vui long nhap thong tin hoc sinh: ");
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Nhap id: ");
		id = scan1.nextInt();
		
		Scanner scan2 = new Scanner(System.in);
		System.out.println("Nhap ten: ");
		name = scan2.nextLine();
		
		Scanner scan3 = new Scanner(System.in);
		System.out.println("Nhap dia chi: ");
		address = scan3.nextLine();
		
		Scanner scan4 = new Scanner(System.in);
		System.out.println("Nhap major: ");
		major = scan4.nextLine();
	}
	
	//ham info
	public void info() {
		System.out.println("\nThong tin hoc sinh nhu sau:");
		System.out.println(id + " | " + name + " | " + address + " | " + major);
		System.out.println("-------------"); 
	}
}
