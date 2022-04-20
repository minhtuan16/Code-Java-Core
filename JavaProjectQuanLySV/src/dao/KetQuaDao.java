package dao;

import java.util.List;

import model.KetQua;

public interface KetQuaDao {
	
	void insert(KetQua kq);
	
//	void update(KetQua kq);
	
	List<KetQua> KQHocTapSinhVien();
}
