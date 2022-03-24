package service;

import java.util.Scanner;

import model.Person;

public class PersonServiceImpl implements PersonService {

	@Override
	public void input(Person person) {
		System.out.println("Nhap id:");
		person.setId(new Scanner(System.in).nextInt());
		
		System.out.println("Nhap name:");
		person.setName(new Scanner(System.in).nextLine());
		
		System.out.println("Nhap age:");
		person.setAge(new Scanner(System.in).nextInt());
		
	}

	@Override
	public void info(Person person) {
		System.out.println("\n");
		System.out.println("ID: " + person.getId());
		System.out.println("Name: " + person.getName());
		System.out.println("Age: " + person.getAge());
	}

}
