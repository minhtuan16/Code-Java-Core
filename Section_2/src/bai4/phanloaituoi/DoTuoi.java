package bai4.phanloaituoi;

import java.util.Scanner;

public class DoTuoi {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhap tuoi:");
		int age = scan.nextInt();
		
		if(age < 1) {
			System.out.println("Tre so sinh");
		} else if(1<= age && age <= 3) {
			System.out.println("Em be");
		} else if(3 < age && age <= 18) {
			System.out.println("Tre em");
		} else if(age == 18) {
			System.out.println("Nguoi lon");
		} else if(40 < age && age <= 60) {
			System.out.println("Trung nien");
		} else if(age >= 60) {
			System.out.println("Nguoi gia");
		} else {
			System.out.println("Ban chua nhap tuoiii !");
		}
	}

}
