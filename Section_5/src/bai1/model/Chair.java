package bai1.model;

public class Chair {
	String moTa;
	String tinhTrang;
	int soLuong;
	
	//contructor mac dinh
	public Chair() {
		
	}
	//contructor truyen vao tham so dau vao
	public Chair(String moTa, String tinhTrang, int soLuong) {
		this.moTa = moTa;
		this.tinhTrang = tinhTrang;
		this.soLuong = soLuong;
	}
	//getter and setter
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
	
	
}
