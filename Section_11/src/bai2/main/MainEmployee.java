package bai2.main;

import bai2.model.Employee;

public class MainEmployee {
	public static void main(String[] args) {
		
		Employee emp = new Employee() {
			@Override
			public void salary() {
				
				super.salary();
				System.out.println("Luong: 10.000.000 VND");
			}
		};
		emp.salary();
		
	}

}
