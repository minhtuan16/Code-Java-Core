package bai1.maxmin;

import java.util.Scanner;

public class MaxMin {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Nhap a: ");
		int a = scan.nextInt();
		System.out.println("Nhap b: ");
		int b = scan.nextInt();
		System.out.println("Nhap c: ");
		int c = scan.nextInt();
		
		System.out.println("Gia tri: a = " + a + " |" + " b = " + b +" |"+ " c = " +c);
		
		int max = (a > b) ? a : b;
		max = (max > c) ? max : c;
		
		int min = (a < b) ? a : b;
		min = (min < c) ? min : c;
		
		System.out.println("Max = " + max);
		System.out.println("Min = " + min);
		
		
		
//		if(a > b && b > c) {
//			System.out.println("Max = " + a);
//			System.out.println("Min = " + c);
//		} else if(a > c && c > b) {
//			System.out.println("Max = " + a);
//			System.out.println("Min = " + b);
//		} else if(b > a && a > c) {
//			System.out.println("Max = " + b);
//			System.out.println("Min =  " +  c);
//		} else if(b > c && c > a) {
//			System.out.println("Max = " + b);
//			System.out.println("Min =  " +  a);
//		} else if(c > a && a > b) {
//			System.out.println("Max = " + c);
//			System.out.println("Min = " + b);
//		} else if(c > b && b > a) {
//			System.out.println("Max = " + c);
//			System.out.println("Min = " + a);
//		}
		
	}
}
