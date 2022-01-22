package bai2.model;

import java.util.Scanner;

public class Developer extends Person {
	private String programLanguage;
	
	public Developer() {
		
	}
	
	public Developer(String programLanguage) {
		super();
		this.programLanguage = programLanguage;
	}

	public String getProgramLanguage() {
		return programLanguage;
	}

	public void setProgramLanguage(String programLanguage) {
		this.programLanguage = programLanguage;
	}
	
	@Override
	public void input() {
		// TODO Auto-generated method stub
		super.input();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ngon ngu chuong trinh: ");
		programLanguage = sc.nextLine();
	}
	
	@Override
	public void info() {
		// TODO Auto-generated method stub
		super.info();
		System.out.println("Ngon ngu: " + programLanguage);
	}
}
