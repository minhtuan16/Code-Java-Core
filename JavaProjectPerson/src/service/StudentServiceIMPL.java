package service;

import java.util.List;
import java.util.Scanner;

import dao.PersonDao;
import dao.PersonDaoIMPL;
import dao.StudentDao;
import dao.StudentDaoIMPL;
import model.Student;

public class StudentServiceIMPL implements StudentService{

	PersonService pService = new PersonServiceIMPL();
	PersonDao dao = new PersonDaoIMPL();
	StudentDao studentDao = new StudentDaoIMPL();
	
	
	@Override
	public void input(Student p) {

		pService.input(p);
		System.out.println("Nhap ma sv: ");
		p.setMaSV(new Scanner(System.in).nextLine());
	}

	@Override
	public void info(Student p) {

		pService.info(p);
		System.out.println("Ma SV: " + p.getMaSV());
	}

	@Override
	public void insert(Student p) {
		pService.insert(p);
		studentDao.insert(p);
		System.out.println("insert thanh cong !");
		
	}

	@Override
	public void update(Student p) {

		System.out.println("ID can sua: ");
		p.setId(new Scanner(System.in).nextInt());
		
		System.out.println("Ma sv moi: ");
		p.setMaSV(new Scanner(System.in).nextLine());
		
		studentDao.update(p);
		System.out.println("update thanh cong !");
	}

	@Override
	public void delete(int id) {

		pService.delete(id);
		studentDao.delete(id);
		System.out.println("delete thanh cong !");
	}

	@Override
	public List<Student> read() {
		return studentDao.selectAll();
	}

	
}
