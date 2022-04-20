package service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import dao.SVDao;
import dao.SVDaoIMPL;
import model.SinhVien;

public class SVServiceIMPL implements SVService {

	SVDao dao = new SVDaoIMPL();
		
	@Override
	public void input(SinhVien sv) {

		while(true) {
			try {
				System.out.println("Nhap ma sv:");
				sv.setMaSV(new Scanner(System.in).nextInt());
				
				break;
			} catch (Exception e) {
				System.out.println("Yeu cau nhap so ! Nhap lai !");
				e.printStackTrace();
			}
		}
		System.out.println("Nhap ho ten: ");
		sv.setHoTen(new Scanner(System.in).nextLine());
		
		System.out.println("Nhap gioi tinh: ");
		sv.setGioiTinh(new Scanner(System.in).nextLine());
		
		while(true) {
			try {
				System.out.println("Nhap ngay sinh (dd/mm/yyyy): ");
				
				String sDate = new Scanner(System.in).nextLine();
				
				SimpleDateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy", new Locale("vi"));
				sv.setNgaySinh(dateFormat.parse(sDate));
				
				break;
			} catch (ParseException e) {
				System.out.println("Ban chua nhap dung dinh dang !");
				e.printStackTrace();
			}
		}
		
		System.out.println("Nhap hoc bong (VND): ");
		sv.setHocBong(new Scanner(System.in).nextInt());
	}

	@Override
	public void info(SinhVien sv) {

		System.out.println("Sinh Vien info: ");
		System.out.println("Ma SV: " + sv.getMaSV());
		System.out.println("Ho Ten: " + sv.getHoTen());
		System.out.println("Gioi Tinh: " + sv.getGioiTinh());
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy", new Locale("vi"));
		System.out.println("Ngay Sinh: " + dateFormat.format(sv.getNgaySinh()));
		
		System.out.println("Ma Lop: " + sv);
		System.out.println("Hoc Bong: " + sv.getHocBong() + " " + "VND");
		System.out.println("------------------");

	}

	@Override
	public void insert(SinhVien sv) {

		dao.insert(sv);
		System.out.println("Insert thanh cong !");
	}

	@Override
	public void update(SinhVien sv) {

		dao.update(sv);
		System.out.println("Update thanh cong !");
	}

	@Override
	public void delete(int MaSV) {

		dao.delete(MaSV);
		System.out.println("Delete thanh cong !");
	}

	@Override
	public List<SinhVien> selectAll() {
		return dao.selectAll();
	}

	@Override
	public List<SinhVien> searchHoTenCuaSV(String HoTen) {
		// TODO Auto-generated method stub
		return dao.searchHoTenCuaSV(HoTen);
	}

	@Override
	public List<SinhVien> searchDSSinhVienTrongLop(String TenLop) {
		// TODO Auto-generated method stub
		return dao.searchDSSinhVienTrongLop(TenLop);
	}

}
