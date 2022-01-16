package bai1.main;

import bai1.model.Chair;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chair c1 = new Chair();
		c1.setMoTa("sofa");
		c1.setTinhTrang("hoi cu");
		c1.setSoLuong(2);
		System.out.println(c1.getMoTa() + " | " + c1.getTinhTrang() + " | " + c1.getSoLuong());
		
		System.out.println("------");
		Chair c2 = new Chair("sofa","hoi cu", 3);
		System.out.println(c2.getMoTa() + " | " + c2.getTinhTrang() + " | " + c2.getSoLuong());
	}

}
