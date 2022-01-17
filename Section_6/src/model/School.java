package model;

import java.util.Scanner;

public class School {
	private int id;
	private String schoolName;
	private String address;
	
	//constructor
	public School() {
		// TODO Auto-generated constructor stub
	}
	
	public School(int id, String schoolName, String address) {
		this.id = id;
		this.schoolName = schoolName;
		this.address = address;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void input() {
		System.out.println("Nhap thong tin");
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter id:");
		id = sc1.nextInt();
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter schoolName:");
		schoolName = sc2.nextLine();
		
		Scanner sc3 = new Scanner(System.in);
		System.out.println("Enter address:");
		address = sc3.nextLine();
	}
	
	public void info() {
		
		System.out.println("ID: " + id + " | " + "School-Name: " + schoolName + " | " + "ADD: " + address);
	}
	
}
