package service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import model.Person;

public class ListExamServiceIMPL implements ListExamService {

	PersonService personService = new PersonServiceIMPL();

	@Override
	public List<Person> input() {
		List<Person> lists = new ArrayList<Person>();
		while (true) {
			System.out.println("Nhap thong tin Person !");
			Person p = new Person();
			personService.input(p);

			lists.add(p);

			System.out.println("Ban co muon tiep tuc ? Nhan E de thoat !");
			String n = new Scanner(System.in).nextLine();
			if (n.equalsIgnoreCase("E")) {
				break;
			}
		}
		return lists;
	}

	@Override
	public void info(List<Person> lists) {
//		List<Person> lists = new ArrayList<Person>();

		System.out.println("Danh sach persons: ");

		for (Person p : lists) {
			personService.info(p);
		}
	}

	@Override
	public void filter(List<Person> list) {

		System.out.println("Person co tuoi < 20:");
		for (Person p : list) {
			if (p.getAge() < 20) {
				personService.info(p);
			}
		}
	}

	@Override
	public void sortPerson(List<Person> list) {

		System.out.println("Sap xep tuoi tang dan");
		Collections.sort(list, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return o1.getAge() - o2.getAge(); 
			}

		});

		info(list);
		
		System.out.println("Sap xep tuoi giam dan");
		Collections.reverse(list);

		info(list);
	}

	@Override
	public void delete(List<Person> list) {

		System.out.println("Danh sach sau khi xoa");
//		for(Person p : list) {
//			if()
//		}
		Iterator<Person> iterator = list.iterator();
		while (iterator.hasNext()) {
			Person s = iterator.next();
			if (s.getName().contains("a")) {
				iterator.remove();
			}
		}

		for (Person p : list) {
			personService.info(p);
		}
	}
}
