package bai2.model;

import java.util.Scanner;

public class Leader extends Person {
	int luongCoBan = 10000000;
	private int teamSize;
	
	public Leader() {
		
	}
	
	public Leader(int teamSize) {
		super();
		this.teamSize = teamSize;
	}

	public int getTeamSize() {
		return teamSize;
	}

	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}
	
	@Override
	public void input() {
		// TODO Auto-generated method stub
		super.input();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so thanh vien kinh nghiem: ");
		teamSize = sc.nextInt();
	}
	
	@Override
	public void info() {
		// TODO Auto-generated method stub
		super.info();
		System.out.println("So thanh vien: " + teamSize);
	}
	
	public void bonus() {
		if(teamSize > 10) {
			System.out.println("Luong cua id " + super.getId() + " :" + luongCoBan * 50 / 100);
		} else {
			System.out.println("Luong cua id " + super.getId() + " :" + luongCoBan * 10 / 100);
		}
	}
}
