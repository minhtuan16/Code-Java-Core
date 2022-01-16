package bai1.model;

public class Table {
	String moTa;
	String tinhTrang;
	int soLuong;
	int soChanBan;
	
	public Table() {
	}
	
	public Table(String moTa, String tinhTrang, int soLuong, int soChanBan) {
		this.moTa = moTa;
		this.tinhTrang = tinhTrang;
		this.soLuong = soLuong;
		this.soChanBan = soChanBan;
	}

	public String getMoTa() {
		return moTa;
	}

	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}

	public String getTinhTrang() {
		return tinhTrang;
	}

	public void setTinhTrang(String tinhTrang) {
		this.tinhTrang = tinhTrang;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	public int getSoChanBan() {
		return soChanBan;
	}

	public void setSoChanBan(int soChanBan) {
		this.soChanBan = soChanBan;
	}
	
	
}
