package bai3.model;

public class Student {
	private int id_Stu;
	private String name_Stu;
	private int age_Stu;
	private School school;
	private Address address;

	public int getId_Stu() {
		return id_Stu;
	}

	public void setId_Stu(int id_Stu) {
		this.id_Stu = id_Stu;
	}

	public String getName_Stu() {
		return name_Stu;
	}

	public void setName_Stu(String name_Stu) {
		this.name_Stu = name_Stu;
	}

	public int getAge_Stu() {
		return age_Stu;
	}

	public void setAge_Stu(int age_Stu) {
		this.age_Stu = age_Stu;
	}

	public School getSchool() {
		return school;
	}

	public void setSchool(School school) {
		this.school = school;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
