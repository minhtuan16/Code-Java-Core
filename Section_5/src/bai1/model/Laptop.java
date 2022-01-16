package bai1.model;

public class Laptop {
	
	String hang;
	String tinhTrang;
	int tuoiTho;
	
	public Laptop() {
		
	}
	
	public Laptop(String hang, String tinhTrang, int tuoiTho) {
		this.hang = hang;
		this.tinhTrang = tinhTrang;
		this.tuoiTho = tuoiTho;
	}

	public String getHang() {
		return hang;
	}

	public void setHang(String hang) {
		this.hang = hang;
	}

	public String getTinhTrang() {
		return tinhTrang;
	}

	public void setTinhTrang(String tinhTrang) {
		this.tinhTrang = tinhTrang;
	}

	public int getTuoiTho() {
		return tuoiTho;
	}

	public void setTuoiTho(int tuoiTho) {
		this.tuoiTho = tuoiTho;
	}
	
}
	
