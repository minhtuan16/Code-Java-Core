package main;

import java.util.List;
import java.util.Scanner;

import model.Lop;
import model.SinhVien;
import service.LopService;
import service.LopServiceIMPL;
import service.SVService;
import service.SVServiceIMPL;

public class MainLop {

	public static void main(String[] args) {
		menuLop();
	}

	private static void menuLop() {

		while (true) {
			System.out.println("_____LOP_____");
			System.out.println("1.Insert LOP");
			System.out.println("2.Update LOP");
			System.out.println("3.Delete LOP");
			System.out.println("4.Read LOP");
			System.out.println("5.searchTenLop");
			System.out.println("6.searchDSLopTrongKhoa");
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
				searchTenLop();
				break;
			} else if (n == 6) {
				searchDSLopTrongKhoa();
				break;
			} else {
				System.out.println("Chuong trinh ket thuc !");
				System.exit(0);
				break;
			}
		}
	}

	private static void searchDSLopTrongKhoa() {

		LopService lS = new LopServiceIMPL();
		System.out.println("Nhap ten lop can tim: ");

		String s = new Scanner(System.in).nextLine();

		List<Lop> list = lS.searchDSLopTrongKhoa(s);

		for (Lop lop : list) {
			lS.info(lop);
		}
	}

	private static void searchTenLop() {

		LopService lS = new LopServiceIMPL();
		System.out.println("Nhap ho ten sv can tim: ");
		String s = new Scanner(System.in).nextLine();

		List<Lop> lists = lS.searchTenLop(s);

		for (Lop lop : lists) {
			lS.info(lop);
		}
	}

	private static void readAll() {

		LopService lS = new LopServiceIMPL();
		List<Lop> list = lS.selectAll();

		System.out.println("Doc ra :");
		for (Lop lop : list) {
			lS.info(lop);
		}
	}

	private static void delete() {

		LopService lS = new LopServiceIMPL();

		System.out.println("Nhap Ma SV can xoa: ");
		int n = new Scanner(System.in).nextInt();

		lS.delete(n);
	}

	private static void update() {

		Lop lop = new Lop();
		LopService lS = new LopServiceIMPL();
		lS.input(lop);
		lS.update(lop);
	}

	private static void insert() {

		LopService lS = new LopServiceIMPL();

		while (true) {
			Lop lop = new Lop();
			lS.input(lop);
			lS.insert(lop);

			System.out.println("Thoat an 0 (nhap so) !");
			int n = new Scanner(System.in).nextInt();

			if (n == 0) {
				break;
			}
		}
	}
}
