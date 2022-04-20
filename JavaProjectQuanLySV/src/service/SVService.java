package service;

import java.util.List;

import model.SinhVien;

public interface SVService {

	void input(SinhVien sv);
	
	void info(SinhVien sv);
	
	void insert(SinhVien sv);
	
	void update(SinhVien sv);
	
	void delete(int MaSV);
	
	List<SinhVien> selectAll();
	
	List<SinhVien> searchHoTenCuaSV(String HoTen);
	
	List<SinhVien> searchDSSinhVienTrongLop(String TenLop);
}
