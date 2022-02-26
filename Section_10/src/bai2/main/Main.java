package bai2.main;

import bai2.model.Laptop;
import bai2.service.LaptopServiceImpl;

public class Main {
	public static void main(String[] args) {
		Laptop laptop = new Laptop();
		
		LaptopServiceImpl laptopImpl = new LaptopServiceImpl();
		
		laptopImpl.input(laptop);
		laptopImpl.info(laptop);
	}
}
