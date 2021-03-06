package bai3.service;

import java.util.Scanner;

import bai3.model.Address;

public class AddressServiceImpl implements AddressService {

	@Override
	public void input(Address add) {
		System.out.println("Nhap thong tin Address");

		System.out.println("Nhap id_add: ");
		add.setId_Add(new Scanner(System.in).nextInt());

		System.out.println("Nhap street:");
		add.setStreet(new Scanner(System.in).nextLine());

		System.out.println("Nhap city: ");
		add.setCity(new Scanner(System.in).nextLine());
	}

	@Override
	public void info(Address add) {
		System.out.println(
				"Id_add: " + add.getId_Add() + " | " + "Street: " + add.getStreet() + " | " + "City: " + add.getCity());

	}

}
