package model;

public class KetQua {

	private int MaSV;
	private String MaMH;
	private float diemThi;

	private SinhVien sinhVien;
	private MonHoc monHoc;

	public MonHoc getMonHoc() {
		return monHoc;
	}

	public void setMonHoc(MonHoc monHoc) {
		this.monHoc = monHoc;
	}

	public SinhVien getSinhVien() {
		return sinhVien;
	}

	public void setSinhVien(SinhVien sinhVien) {
		this.sinhVien = sinhVien;
	}

	public int getMaSV() {
		return MaSV;
	}

	public void setMaSV(int maSV) {
		MaSV = maSV;
	}

	public String getMaMH() {
		return MaMH;
	}

	public void setMaMH(String maMH) {
		MaMH = maMH;
	}

	public float getDiemThi() {
		return diemThi;
	}

	public void setDiemThi(float diemThi) {
		this.diemThi = diemThi;
	}

}
