package service;

import java.util.List;

import model.KetQua;

public interface KetQuaService {

	void input(KetQua kq);
	
	void info(KetQua kq);
	
	void insert(KetQua kq);
	
	List<KetQua> KQHocTapSinhVien();
}
