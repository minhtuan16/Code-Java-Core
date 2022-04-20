package service;

import java.util.List;
import java.util.Scanner;

import dao.KetQuaDao;
import dao.KetQuaDaoIMPL;
import model.KetQua;

public class KetQuaServiceIMPL implements KetQuaService {

	KetQuaDao dao = new KetQuaDaoIMPL();

	@Override
	public void input(KetQua kq) {

		while (true) {
			try {
				System.out.println("Nhap ma sv:");
				kq.setMaSV(new Scanner(System.in).nextInt());

				break;
			} catch (Exception e) {
				System.out.println("Yeu cau nhap so ! Nhap lai !");
				e.printStackTrace();
			}
		}
		System.out.println("Nhap ma mh: ");
		kq.setMaMH(new Scanner(System.in).nextLine());

		System.out.println("Nhap diem thi: ");
		kq.setDiemThi(new Scanner(System.in).nextFloat());
	}

	@Override
	public void info(KetQua kq) {

		System.out.println("Ket Qua info: ");
		System.out.println("Ma SV: " + kq.getMaSV());
		System.out.println("Ma MH: " + kq.getMaMH());
		System.out.println("Diem Thi: " + kq.getDiemThi());

		System.out.println("------------------");

	}

	@Override
	public void insert(KetQua kq) {

		dao.insert(kq);
		System.out.println("Insert thanh cong !");
	}

//	@Override
//	public void update(Lop lop) {
//
//		dao.update(lop);
//		System.out.println("Update thanh cong !");
//	}
//
//	@Override
//	public void delete(int MaLop) {
//
//		dao.delete(MaLop);
//		System.out.println("Delete thanh cong !");
//	}

	@Override
	public List<KetQua> KQHocTapSinhVien() {
		return dao.KQHocTapSinhVien();
	}

//	@Override
//	public List<Lop> searchTenLop(String TenLop) {
//		// TODO Auto-generated method stub
//		return dao.searchTenLop(TenLop);
//	}
//
//	@Override
//	public List<Lop> searchDSLopTrongKhoa(String TenKhoa) {
//		// TODO Auto-generated method stub
//		return dao.searchDSLopTrongKhoa(TenKhoa);
//	}

}
