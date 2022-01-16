package baitapstring;

import java.util.Scanner;

public class StringMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Nhap chuoi 1: ");
		String s1 = scan.nextLine();
		System.out.println("Độ dài string: " + s1.length());
		System.out.println("---------");
		
		//kiem tra s2 co trong s1 k ?
		System.out.println("\nNhap chuoi 2: "); 
		String s2 = scan.nextLine();
		if(s1.contains(s2)) {
			System.out.println("Co chua");
		} else {
			System.out.println("Khong chua");
		}
		System.out.println("---------");
		
		
		//kiem tra s1 co bao nhieu ki tu 'a'
		int count = 0;
		for(int i = 0; i < s1.length(); i++) {
			if(s1.charAt(i) == 'a') {
				count++;
			}
		}
		System.out.println("\nCo bao nhieu ki tu 'a' : " + count);
		System.out.println("---------");
		
		//cat chuoi s1 thanh Mang string boi khoang trang và in ra cac chuoi do
		String[] words = s1.split("\\s");
		for(String w : words) {
			System.out.println(w);
		}
	}

}
