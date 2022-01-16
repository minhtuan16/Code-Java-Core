package bai2.main;

import bai2.hinhhoc.HinhChuNhat;
import bai2.hinhhoc.HinhTamGiacVuong;
import bai2.hinhhoc.HinhTron;
import bai2.hinhhoc.HinhVuong;

public class MainHinhHoc {

	public static void main(String[] args) {
		//Chu vi va dien tich hinh vuong
		float canhHinhVuong = 4.2f;
		System.out.println(HinhVuong.chuVi(canhHinhVuong));
		System.out.println(HinhVuong.dienTich(canhHinhVuong));
		
		
		//chu vi va dien tich hinh tron
		double banKinh = 5;
		System.out.println(HinhTron.chuVi(banKinh));
		System.out.println(HinhTron.dienTich(banKinh));
	
		
		//chu vi va dien tich hinh tam giac vuong
		float a = 5;
		float b = 8;
		float c = 9;
		System.out.println(HinhTamGiacVuong.chuVi(a, b, c));
		System.out.println(HinhTamGiacVuong.dienTich(a, b));
		
		
		// chu vi va dien tich hinh chu nhat
		int chieuDai = 10;
		int chieuRong = 8;
		System.out.println(HinhChuNhat.chuVi(chieuDai, chieuRong));
		System.out.println(HinhChuNhat.dienTich(chieuDai, chieuRong));
	}

}
