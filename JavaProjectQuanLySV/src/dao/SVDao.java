package dao;

import java.util.List;

import model.SinhVien;

public interface SVDao {

	void insert(SinhVien sv);
	
	void update(SinhVien sv);
	
	void delete(int MaSV);
	
	List<SinhVien> selectAll();
	
	List<SinhVien> searchHoTenCuaSV(String HoTen);
	
	List<SinhVien> searchDSSinhVienTrongLop(String TenLop);
}
