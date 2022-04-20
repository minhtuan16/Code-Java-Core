
package model;

import java.io.Serializable;
import java.util.Date;

public class SinhVien implements Serializable {

	private int maSV;
	private String HoTen;
	private String GioiTinh;
	private Date NgaySinh;
	private int MaLop;
	private int HocBong;

	private Lop lop;

	public Lop getLop() {
		return lop;
	}

	public void setLop(Lop lop) {
		this.lop = lop;
	}

	public int getMaSV() {
		return maSV;
	}

	public void setMaSV(int maSV) {
		this.maSV = maSV;
	}

	public String getHoTen() {
		return HoTen;
	}

	public void setHoTen(String hoTen) {
		HoTen = hoTen;
	}

	public String getGioiTinh() {
		return GioiTinh;
	}

	public void setGioiTinh(String gioiTinh) {
		GioiTinh = gioiTinh;
	}

	public Date getNgaySinh() {
		return NgaySinh;
	}

	public void setNgaySinh(Date ngaySinh) {
		NgaySinh = ngaySinh;
	}

	public int getMaLop() {
		return MaLop;
	}

	public void setMaLop(int maLop) {
		MaLop = maLop;
	}

	public int getHocBong() {
		return HocBong;
	}

	public void setHocBong(int hocBong) {
		HocBong = hocBong;
	}

}
