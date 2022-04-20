package main;

import java.util.List;
import java.util.Scanner;

import model.KetQua;
import model.Lop;
import model.SinhVien;
import service.KetQuaService;
import service.KetQuaServiceIMPL;
import service.LopService;
import service.LopServiceIMPL;
import service.SVService;
import service.SVServiceIMPL;

public class MainKetQua {

	public static void main(String[] args) {
		menuKetQua();
	}

	private static void menuKetQua() {

		while (true) {
			System.out.println("_____KET QUA_____");
			System.out.println("1.Insert KET QUA");
			System.out.println("2.Read KET QUA");
			System.out.println("3.Exit");

			System.out.println("Vui long chon !");

			int n = new Scanner(System.in).nextInt();
			if (n == 1) {
				insert();
				break;
			} else if (n == 2) {
				KQHocTapSinhVien();
				break;
			} else {
				System.out.println("Chuong trinh ket thuc !");
				System.exit(0);
				break;
			}
		}
	}

	private static void KQHocTapSinhVien() {

		KetQuaService kqS = new KetQuaServiceIMPL();

		List<KetQua> list = kqS.KQHocTapSinhVien();

		for (KetQua kq : list) {
			kqS.info(kq);
		}
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
