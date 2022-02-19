package bai1.main;

import java.util.Scanner;

import bai1.model.Nation;
import bai1.model.Person;

public class MainNation {
	public static void main(String[] args) {
		Nation nation = new Nation();
		nation.input();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap n-person: ");
		int n = sc.nextInt();
		
		Person[] persons = new Person[n];
		
		for(int i = 0; i < persons.length; i++) {
			persons[i] = new Person();
			persons[i].input();
			persons[i].setNation(nation);
		}
		
		for(Person person : persons) {
			person.infor();
			person.getNation().info();
		}
	}
}
