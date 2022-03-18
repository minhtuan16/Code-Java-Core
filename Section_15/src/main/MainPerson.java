package main;

import model.Person;
import service.PersonService;
import service.PersonServiceIMPL;

public class MainPerson {

	public static void main(String[] args) {
		Person p = new Person(1, "a", 28);
		
		Person p1 = new Person(2, "b", 29);
		
		System.out.println(p.equals(p1));
	}
}
