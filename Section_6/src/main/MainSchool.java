package main;

import java.util.Scanner;

import model.School;

public class MainSchool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap n: ");
		int n = sc.nextInt();
		
		School[] schools = new School[n];
		
		for(int i = 0; i < schools.length; i++) {
			schools[i] = new School();
			schools[i].input();
		}
		
		System.out.println("Thong tin nhu sau:");
		for(School school : schools) {
			school.info();
		}
		
		System.out.println("=======");
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Nhap ten truong muon tim:");
		String ten = sc2.nextLine();
		
		for(int i = 0; i < schools.length; i++) {
			if(schools[i].getSchoolName().trim().contains(ten)) {
				System.out.println("Tim thay roi ne !!");
				System.out.println("ID: " + schools[i].getId() + " | " + "School-Name: " + schools[i].getSchoolName() + " | " + "ADD: " + schools[i].getAddress());
			}
		}
	}

}
