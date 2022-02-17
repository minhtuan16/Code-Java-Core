package bai1.model;

import java.util.Scanner;

public class House {
	private int id_House;
	private int number_House;
	private String address_House;
	private int floor_House;
	private Person owner;
	
	public House() {
		
	}
	
	public House(int id_House, int number_House, String address_House, int floor_House, Person owner) {
		super();
		this.id_House = id_House;
		this.number_House = number_House;
		this.address_House = address_House;
		this.floor_House = floor_House;
		this.owner = owner;
	}

	
	public int getId_House() {
		return id_House;
	}
	public void setId_House(int id_House) {
		this.id_House = id_House;
	}
	public int getNumber_House() {
		return number_House;
	}
	public void setNumber_House(int number_House) {
		this.number_House = number_House;
	}
	public String getAddress_House() {
		return address_House;
	}
	public void setAddress_House(String address_House) {
		this.address_House = address_House;
	}
	public int getFloor_House() {
		return floor_House;
	}
	public void setFloor_House(int floor_House) {
		this.floor_House = floor_House;
	}
	public Person getOwner() {
		return owner;
	}

	public void setOwner(Person owner) {
		this.owner = owner;
	}

	//input
	public void input() {
		System.out.println("INFORMATION HOUSE !");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id_House: ");
		id_House = sc.nextInt();
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter number_House: ");
		number_House = sc1.nextInt();
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter address_House: ");
		address_House = sc2.nextLine();
		
		Scanner sc3 = new Scanner(System.in);
		System.out.println("Enter floor_House: ");
		floor_House = sc3.nextInt();
	}
	
	//infor
	public void infor() {
		System.out.println("--------");
		System.out.println("RECONFIRM INFORMATION HOUSE !!!");
		System.out.println("id_House: " + id_House + "| " + "number_House: " + number_House + "| " + "address_House: " + address_House + "| " + "floor_House: " + floor_House);
	}
}
