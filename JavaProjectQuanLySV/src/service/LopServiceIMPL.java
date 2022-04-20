package service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import dao.LopDao;
import dao.LopDaoIMPL;
import dao.SVDao;
import dao.SVDaoIMPL;
import model.Lop;
import model.SinhVien;

public class LopServiceIMPL implements LopService {

	LopDao dao = new LopDaoIMPL();
		
	@Override
	public void input(Lop lop) {

		while(true) {
			try {
				System.out.println("Nhap ma lop:");
				lop.setMaLop(new Scanner(System.in).nextInt());
				
				break;
			} catch (Exception e) {
				System.out.println("Yeu cau nhap so ! Nhap lai !");
				e.printStackTrace();
			}
		}
		System.out.println("Nhap ten lop: ");
		lop.setTenLop(new Scanner(System.in).nextLine());
		
		
		System.out.println("Nhap ma khoa: ");
		lop.setMaKhoa(new Scanner(System.in).nextLine());
	}

	@Override
	public void info(Lop lop) {

		System.out.println("Lop info: ");
		System.out.println("Ma lop: " + lop.getMaLop());
		System.out.println("Ten lop: " + lop.getTenLop());
		System.out.println("Ma khoa: " + lop.getMaKhoa());
	
		System.out.println("------------------");

	}

	@Override
	public void insert(Lop lop) {

		dao.insert(lop);
		System.out.println("Insert thanh cong !");
	}

	@Override
	public void update(Lop lop) {

		dao.update(lop);
		System.out.println("Update thanh cong !");
	}

	@Override
	public void delete(int MaLop) {

		dao.delete(MaLop);
		System.out.println("Delete thanh cong !");
	}

	@Override
	public List<Lop> selectAll() {
		return dao.selectAll();
	}

	@Override
	public List<Lop> searchTenLop(String TenLop) {
		// TODO Auto-generated method stub
		return dao.searchTenLop(TenLop);
	}

	@Override
	public List<Lop> searchDSLopTrongKhoa(String TenKhoa) {
		// TODO Auto-generated method stub
		return dao.searchDSLopTrongKhoa(TenKhoa);
	}

}
