package bai1.model;

public class Person {
	String ten;
	String diaChi;
	int tuoi;
	String ngheNghiep;
	
	public Person() {
		
	}
	
	public Person(String ten, String diaChi, int tuoi, String ngheNghiep) {
		this.ten = ten;
		this.diaChi = diaChi;
		this.tuoi = tuoi;
		this.ngheNghiep = ngheNghiep;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public int getTuoi() {
		return tuoi;
	}

	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}

	public String getNgheNghiep() {
		return ngheNghiep;
	}

	public void setNgheNghiep(String ngheNghiep) {
		this.ngheNghiep = ngheNghiep;
	}
	
	
}
