package bai4.mang;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhap n: ");
		int n = scan.nextInt();

		int[] mang = new int[n];
		System.out.println("Nhap cac phan tu: ");
		for (int i = 0; i < mang.length; i++) {
			mang[i] = scan.nextInt();
		}
		
		//in ra cac phan tu da nhap
		System.out.println("-------");
		System.out.println("Cac phan tu da nhap:");
		for(int x : mang) {
			System.out.println(x);
		}
		System.out.println("--------");
		
		// tong cac phan tu
		int tong = 0; 
		for(int i = 0; i < mang.length; i++)
			tong += mang[i];

		System.out.println("Tong cac phan tu da nhap: " + tong);
		
		System.out.println("--------");
		
		//tich cac phan tu
		int tich = 1; 
		for(int i = 0; i < mang.length; i++)
			tich *= mang[i];
		System.out.println("Tich cac phan tu da nhap: " + tich);
		
		
		System.out.println("--------");
		
		//tim min, max
		int max = mang[0];
		for(int i = 0; i < mang.length; i++) {
			if(max < mang[i])
				max = mang[i];
		}
		System.out.println("Max = " + max);
		
		int min = mang[0];
		for(int i = 0; i < mang.length; i++) {
			if(min > mang[i])
				min = mang[i];
		}
		System.out.println("Min = " + min);
		
		System.out.println("--------");
		int temp = 0;
		for(int i = 0; i < mang.length -1; i++) {
			for(int j = i+1; j < mang.length; j++) {
				if(mang[i] > mang[j]) {
					temp = mang[i];
					mang[i] = mang[j];
					mang[j] = temp;
				}
			}
		}
		System.out.println("Sap xep tang dan:");
		for(int i = 0; i < mang.length; i++) {
			System.out.println(mang[i]);
		}
		
		
	}

}
