package main;

import java.util.List;
import java.util.Scanner;

import model.SinhVien;
import service.SVService;
import service.SVServiceIMPL;

public class MainSinhVien {

	public static void main(String[] args) {
		menuSinhVien();
	}

	private static void menuSinhVien() {

		while (true) {
			System.out.println("_____SINH VIEN_____");
			System.out.println("1.Insert SINH VIEN");
			System.out.println("2.Update SINH VIEN");
			System.out.println("3.Delete SINH VIEN");
			System.out.println("4.Read SINH VIEN");
			System.out.println("5.searchHoTenCuaSV");
			System.out.println("6.searchDSSinhVienTrongLop");
			System.out.println("7.Exit");

			System.out.println("Vui long chon !");

			int n = new Scanner(System.in).nextInt();
			if (n == 1) {
				insert();
				break;
			} else if (n == 2) {
				update();
				break;
			} else if (n == 3) {
				delete();
				break;
			} else if (n == 4) {
				readAll();
				break;
			} else if (n == 5) {
				searchHoTenCuaSV();
				break;
			} else if (n == 6) {
				searchDSSinhVienTrongLop();
				break;
			} else {
				System.out.println("Chuong trinh ket thuc !");
				System.exit(0);
				break;
			}
		}
	}

	private static void searchDSSinhVienTrongLop() {

		SVService svS = new SVServiceIMPL();
		System.out.println("Nhap ten lop can tim: ");

		String s = new Scanner(System.in).nextLine();

		List<SinhVien> list = svS.searchDSSinhVienTrongLop(s);

		for (SinhVien sv : list) {
			svS.info(sv);
		}
	}

	private static void searchHoTenCuaSV() {

		SVService svS = new SVServiceIMPL();
		System.out.println("Nhap ho ten sv can tim: ");
		String s = new Scanner(System.in).nextLine();

		List<SinhVien> lists = svS.searchHoTenCuaSV(s);

		for (SinhVien sv : lists) {
			svS.info(sv);
		}
	}

	private static void readAll() {

		SVService svS = new SVServiceIMPL();
		List<SinhVien> list = svS.selectAll();

		System.out.println("Doc ra :");
		for (SinhVien sv : list) {
			svS.info(sv);
		}
	}

	private static void delete() {

		SinhVien sv = new SinhVien();
		SVService svS = new SVServiceIMPL();

		System.out.println("Nhap Ma SV can xoa: ");
		int n = new Scanner(System.in).nextInt();

		svS.delete(n);
	}

	private static void update() {

		SinhVien sv = new SinhVien();
		SVService svS = new SVServiceIMPL();
		svS.input(sv);
		svS.update(sv);
	}

	private static void insert() {

		SVService svS = new SVServiceIMPL();

		while (true) {
			SinhVien sv = new SinhVien();
			svS.input(sv);
			svS.insert(sv);

			System.out.println("Thoat an 0 (nhap so) !");
			int n = new Scanner(System.in).nextInt();

			if (n == 0) {
				break;
			}
		}
	}
}
