package service;

import java.util.List;

import model.Lop;

public interface LopService {

	void input(Lop lop);
	
	void info(Lop lop);
	
	void insert(Lop lop);
	
	void update(Lop lop);
	
	void delete(int MaLop);
	
	List<Lop> selectAll();
	
	List<Lop> searchTenLop(String TenLop);
	
	List<Lop> searchDSLopTrongKhoa(String TenKhoa);
}
