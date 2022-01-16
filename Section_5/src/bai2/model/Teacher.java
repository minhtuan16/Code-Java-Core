package bai2.model;

import java.util.Scanner;

public class Teacher {
	int id;
	String name;
	String address;
	String facility;
	
	public Teacher() {
		
	}
	public Teacher(int id, String name, String address, String facility) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.facility = facility;
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
	public String getFacility() {
		return facility;
	}
	public void setFacility(String facility) {
		this.facility = facility;
	}
	
	public void input() {
		System.out.println("Nhap thong tin giao vien:");
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Nhap id: ");
		id = sc1.nextInt();
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Nhap ten: ");
		name = sc2.nextLine();
		
		Scanner sc3 = new Scanner(System.in);
		System.out.println("Nhap dia chi: ");
		address = sc3.nextLine();
		
		Scanner sc4 = new Scanner(System.in);
		System.out.println("Nhap cong ty: ");
		facility = sc4.nextLine();
	}
	
	public void info() {
		System.out.println("\nThong tin cua giao vien nhu sau:");
		System.out.println(id + " | " + name + " | " + address + " | " + facility);
		System.out.println("-------");
	}
}

