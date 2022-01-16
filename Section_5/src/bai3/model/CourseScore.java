package bai3.model;

import java.util.Scanner;

public class CourseScore {
	int id;
	double score; 
	String name;
	
	public CourseScore() {
		
	}
	public CourseScore(int id, double score, String name) {
		this.id = id;
		this.score = score;
		this.name = name;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//ham input
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap id: ");
		id = sc.nextInt();
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("nhap score: ");
		score = sc2.nextDouble();
		
		Scanner sc3 = new Scanner(System.in);
		System.out.println("nhap ten: ");
		name = sc3.nextLine();
	}
	
	public void info() {
		System.out.println("\nThong tin nhu sau: ");
		
		if(score < 5) {
			System.out.println(id + " | " + "Yeu" + " | " + name);
		} else if(score >= 5 && score < 7) {
			System.out.println(id + " | " + "TB" + " | " + name);
		} else if(score >= 7 && score < 8) {
			System.out.println(id + " | " + "Kha" + " | " + name);
		} else if(score >= 8 && score < 9) {
			System.out.println(id + " | " + "Gioi" + " | " + name);
		} else {
			System.out.println(id + " | " + "Xuat sac" + " | " + name);
		}
	}
}
