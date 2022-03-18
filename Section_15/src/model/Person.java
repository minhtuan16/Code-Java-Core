package model;

public class Person {

	private int id;
	private String name;
	private int age;

	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

//	@Override
//	public boolean equals(Object obj) {
//
//		if (obj instanceof Person) {
//			Person p = (Person) obj;
//			if (p.getAge() == this.getAge()) {
//				System.out.println("2 doi tuong co tuoi bang nhau");
//				return true;
//			} else {
//				System.out.println("2 doi tuong khong co tuoi bang nhau");
//				return false;
//			}
//		} else {
//			System.out.println("Obj khong phai la Person");
//			return false;
//		}
//	}
}
