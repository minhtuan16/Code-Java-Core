package bai1.model;

import java.util.Scanner;

public class Student extends Person {
	private String lop;
	
	//constructor
	public Student() {
		
	}
	
	public Student(String lop) {
		super(); //goi ham cha
		this.lop = lop;
	}

	public String getLop() {
		return lop;
	}

	public void setLop(String lop) {
		this.lop = lop;
	}
	
	@Override
	public void input() {
		super.input();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap lop: ");
		lop = sc.nextLine();
	}
	
	@Override
	public void info() {
		super.info();
		System.out.println("Lop: " + lop);
	}
}
