package bai1.main;

import bai1.model.House;
import bai1.model.Person;

public class MainPerson {

	public static void main(String[] args) {
		Person person = new Person();
		person.input();
		
		House[] houses = new House[2];
		for(int i = 0; i < houses.length; i++) {
			houses[i] = new House();
			houses[i].input();
			houses[i].setOwner(person);	
		}
		
		for(House house : houses) {
			house.infor();
			house.getOwner().infor();
		}
	}

}
