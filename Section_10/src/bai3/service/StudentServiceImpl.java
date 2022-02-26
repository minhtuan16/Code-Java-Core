package bai3.service;

import java.util.Scanner;

import bai3.model.Address;
import bai3.model.School;
import bai3.model.Student;

public class StudentServiceImpl implements StudentService {

	@Override
	public void input(Student stu) {
		System.out.println("Nhap thong tin Student");

		System.out.println("Nhap id_stu: ");
		stu.setId_Stu(new Scanner(System.in).nextInt());

		System.out.println("Nhap name_stu: ");
		stu.setName_Stu(new Scanner(System.in).nextLine());

		System.out.println("Nhap age_stu: ");
		stu.setAge_Stu(new Scanner(System.in).nextInt());

		School school = new School();
		SchoolServiceImpl schImpl = new SchoolServiceImpl();
		schImpl.input(school);
		stu.setSchool(school);

		Address address = new Address();
		AddressServiceImpl addImpl = new AddressServiceImpl();
		addImpl.input(address);
		stu.setAddress(address);
	}

	@Override
	public void info(Student stu) {
		System.out.println("--------------");
		System.out.println("Id_stu: " + stu.getId_Stu() + " | " + "Name_stu: " + stu.getName_Stu() + " | " + "Age_stu: "
				+ stu.getAge_Stu());

//		if (stu.getSchool() != null) {
//			SchoolServiceImpl schoolImpl = new SchoolServiceImpl();
//			schoolImpl.info(stu.getSchool());
//		} else {
//			System.out.println("Ban chua nhap thong tin School !!!");
//		}
//
//		if (stu.getAddress() != null) {
//			AddressServiceImpl addressImpl = new AddressServiceImpl();
//			addressImpl.info(stu.getAddress());
//		} else {
//			System.out.println("Ban chua nhap thong tin Address !!!");
//		}
		
		SchoolServiceImpl schoolImpl = new SchoolServiceImpl();
		schoolImpl.info(stu.getSchool());
		
		AddressServiceImpl addressImpl = new AddressServiceImpl();
		addressImpl.info(stu.getAddress());
		
	}

}
