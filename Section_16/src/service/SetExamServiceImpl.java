package service;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import model.Person;

public class SetExamServiceImpl implements SetExamService {
	PersonService personService = new PersonServiceImpl();

	@Override
	public Set<Person> input() {
		Set<Person> set = new HashSet<Person>();
		
		while(true) {
			System.out.println("Nhap person:");
			Person p = new Person();
			personService.input(p);
			
			set.add(p);
			
			System.out.println("An 1 de thoat !");
			int n = new Scanner(System.in).nextInt();
			
			if(n == 1) {
				break;
			}
		}
		return set;
	}

	@Override
	public void info(Set<Person> set) {
	
		for(Person p : set) {
			personService.info(p);
		}
	}

	@Override
	public void filter(Set<Person> list) {

		System.out.println("Person co tuoi nho hon 20: ");
		for(Person p : list) {
			if(p.getAge() < 20) {
				personService.info(p);
			}
		}
	}

	@Override
	public void delete(Set<Person> list) {

		System.out.println("Danh sach sau khi xoa:");
		Iterator<Person> iterator = list.iterator();
		
		while(iterator.hasNext()) {
			Person p = iterator.next();
			if(p.getName().contains("a")) {
				iterator.remove();
			}
		}
		
		for(Person p : list) {
			personService.info(p);
		}
	}

}
