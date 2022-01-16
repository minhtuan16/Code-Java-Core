package bai3.main;

import java.util.Scanner;

import bai3.tinhtoan.TinhToan;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhap a: ");
		
		double a = scan.nextDouble();
		System.out.println("Căn bậc 2 của a là: " + TinhToan.canBac2(a));
		System.out.println("Bình phương của a là: " + TinhToan.binhPhuong(a));
		System.out.println("Tích của a và Pi là: " + TinhToan.tichPiA(a));
	}

}
