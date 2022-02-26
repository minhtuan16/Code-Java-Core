package bai3.service;

import java.util.Scanner;

import bai3.model.School;

public class SchoolServiceImpl implements SchoolService {

	@Override
	public void input(School sch) {
		System.out.println("Nhap thong tin School");

		System.out.println("Nhap id_sch: ");
		sch.setId_Sch(new Scanner(System.in).nextInt());

		System.out.println("Nhap name_sch: ");
		sch.setName_Sch(new Scanner(System.in).nextLine());

	}

	@Override
	public void info(School sch) {

		System.out.println("Id_sch: " + sch.getId_Sch() + " | " + "Name_sch: " + sch.getName_Sch());
	}

}
