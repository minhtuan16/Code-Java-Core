package bai1.main;

import java.util.Scanner;

import bai1.model.Animal;
import bai1.model.Chicken;
import bai1.model.Dog;

public class Main {
	public static void main(String[] args) {
//		Dog dg = new Dog();
//		Chicken ck = new Chicken();
//		
//		input(dg);
//		info(dg);
//		
//		input(ck);
//		info(ck);
		while(true) {
			System.out.println("Vui long chon dong vat !!!");
			System.out.println("1.Menu Dog");
			System.out.println("2.Menu Chicken");
			System.out.println("3.Exit");
		
			int n = new Scanner(System.in).nextInt();
			
			if(n == 1) {
				System.out.println("1.Menu Dog");
				menuDog();
				break;
			} else if(n == 2) {
				System.out.println("2.Menu Chicken");
				menuChicken();
				break;
			} else if(n == 3) {
				System.out.println("Ban da thoat chuong trinh");
				System.exit(n);
			} else {
				System.out.println("Ban chua chon dong vat !");
			}
		}
	}
	
	public static void input(Animal a) {
		System.out.println("Nhap id: ");
		a.setId(new Scanner(System.in).nextInt());
		
		if(a instanceof Dog) {
			Dog dg = (Dog) a;
			
			System.out.println("Nhap tuoi: ");
			dg.setAge(new Scanner(System.in).nextInt());
		}
		
		if(a instanceof Chicken) {
			Chicken ck = (Chicken) a;
			
			System.out.println("Nhap so chan: ");
			ck.setSoChan(new Scanner(System.in).nextInt());
		}
	}
	
	public static void info(Animal a) {
		System.out.println("---------");
//		System.out.println(a.getId());
		
		if (a instanceof Dog) {
			Dog dg = (Dog) a;
			System.out.println(a.getId() + "| " + dg.getAge());
		}
		
		if (a instanceof Chicken) {
			Chicken ck = (Chicken) a;
			System.out.println(a.getId() + "| " + ck.getSoChan());
		}
	}
	
	public static void menuDog() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so luong dog: ");
		int n = sc.nextInt();
		
		Dog[] dogs = new Dog[n];
		for(int i = 0; i < dogs.length; i++) {
			dogs[i] = new Dog();
			input(dogs[i]);
		}
		
		for(Dog dog : dogs) {
			info(dog);
		}
		
	}
	
public static void menuChicken() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so luong chicken: ");
		int m = sc.nextInt();
		
		Chicken[] chickens = new Chicken[m];
		for(int i = 0; i < chickens.length; i++) {
			chickens[i] = new Chicken();
			input(chickens[i]);
		}
		
		for(Chicken chicken : chickens) {
			info(chicken);
		}
		
	}
	
}
