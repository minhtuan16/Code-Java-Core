package bai1.main;

import java.util.Scanner;

public class TongHaiSo {
	public static void main(String[] args) {
		while (true) {
			try {
				System.out.println("Nhap x: ");
				int x = new Scanner(System.in).nextInt();

				System.out.println("Nhap y: ");
				int y = new Scanner(System.in).nextInt();

				int sum = x + y;
				System.out.println("Tong 2 so x + y : " + sum);
				break;
			} catch (Exception e) {
				System.out.println("Vui long nhap lai bang so !!!");
			}
		}

	}
}
