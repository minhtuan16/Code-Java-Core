package bai4.main;

import java.util.Scanner;

import bai4.giaipt.GiaiPhuongTrinhBac1;

public class MainGiaiPT {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Nhap a: ");
		double a = scan.nextFloat();
		
		System.out.println("Nhap b: ");
		double b = scan.nextFloat();
		
		System.out.println("kq: " + GiaiPhuongTrinhBac1.phuongTrinhBac1(a, b));
	}
}
