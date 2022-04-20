package dao;

import java.util.List;

import model.Lop;
import model.SinhVien;

public interface LopDao {

	void insert(Lop lop);
	
	void update(Lop lop);
	
	void delete(int MaLop);
	
	List<Lop> selectAll();
	
	List<Lop> searchTenLop(String TenLop);
	
	List<Lop> searchDSLopTrongKhoa(String TenKhoa);
}
