package bai2.ptbac2;

import java.util.Scanner;

public class PhuongTrinhBac2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Nhap a: ");
		float a = scan.nextFloat();
		System.out.println("Nhap b: ");
		float b = scan.nextFloat();
		System.out.println("Nhap c: ");
		float c = scan.nextFloat();

		if (a == 0) {
			if (b == 0) {
				if (c == 0) {
					System.out.println("PT vo so nghiem");
				} else {
					System.out.println("PT vo nghiem");
				}
			} else {
				System.out.println("kq: x = " + (-c / b));
			}
		} else {
			float delta = b * b - 4 * a * c;
			if (delta < 0) {
				System.out.println("PT vo nghiem");
			} else if (delta == 0) {
				System.out.println("kq: x = " + (-b / (2 * a)));
			} else {
				System.out.println("kq: x1 = " + (-b + Math.sqrt(delta)) / (2 * a));
				System.out.println("kq: x2 = " + (-b - Math.sqrt(delta)) / (2 * a));
			}
		}

	}

}
