package bai1.model;

import java.util.Scanner;

public class Teacher extends Person {
	private String monHoc;
	
	public Teacher() {
		
	}
	
	public Teacher(String monHoc) {
		super();
		this.monHoc = monHoc;
	}

	public String getMonHoc() {
		return monHoc;
	}

	public void setMonHoc(String monHoc) {
		this.monHoc = monHoc;
	}
	
	@Override
	public void input() {
		super.input();
		
		System.out.println("Nhap mon hoc: ");
		Scanner sc = new Scanner(System.in);
		monHoc = sc.nextLine();
	}
	
	@Override
	public void info() {
		super.info();
		System.out.println("Mon hoc: " + monHoc);
	}
}
