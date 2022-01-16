package bai3.giaithua;

import java.util.Scanner;

public class TinhGiaiThua {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhap n: ");
		int n = scan.nextInt();
		tinhGiaiThua(n);
	}
	
	public static void tinhGiaiThua(int n) {
		if(n > 0) {
			int i = 1;
			int gt = 1;
			while(i <= n) {
				gt *= i;
				i++;
			}
			System.out.println("GT = " + gt);
		}
	}

}
