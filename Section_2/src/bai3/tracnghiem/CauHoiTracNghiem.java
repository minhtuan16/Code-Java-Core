package bai3.tracnghiem;

import java.util.Scanner;

public class CauHoiTracNghiem {

	public static void main(String[] args) {
		
		System.out.println("Cau hoi: Chon 1 trong 4 cau tra loi sau:");
		System.out.println("1. Coc nuoc");
		System.out.println("2. Binh nuoc");
		System.out.println("3. Chau nuoc");
		System.out.println("4. Thau nuoc");
		
		System.out.println("\n");
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhap cau tra loi:");
		int a = scan.nextInt();
		
		switch(a) {
			case(1): 
				System.out.println("1. Coc nuoc");
				break;
			case(2): 
				System.out.println("2. Binh nuoc");
				break;
			case(3): 
				System.out.println("3. Chau nuoc");
				break;
			case(4): 
				System.out.println("4. Thau nuoc");
				break;
			default: 
				System.out.println("Chua chon !!!");
		}
	}

}
