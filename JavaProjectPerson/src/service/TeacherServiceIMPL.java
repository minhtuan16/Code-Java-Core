package service;

import java.util.List;
import java.util.Scanner;

import dao.PersonDao;
import dao.PersonDaoIMPL;
import dao.StudentDao;
import dao.StudentDaoIMPL;
import dao.TeacherDao;
import dao.TeacherDaoIMPL;
import model.Student;
import model.Teacher;

public class TeacherServiceIMPL implements TeacherService{

	PersonService pService = new PersonServiceIMPL();
	PersonDao dao = new PersonDaoIMPL();
	TeacherDao teacherDao = new TeacherDaoIMPL();
	
	
	@Override
	public void input(Teacher t) {

		pService.input(t);
		System.out.println("Nhap email: ");
		t.setEmail(new Scanner(System.in).nextLine());
	}

	@Override
	public void info(Teacher t) {

		pService.info(t);
		System.out.println("Email: " + t.getEmail());
		System.out.println("--------------");
	}

	@Override
	public void insert(Teacher t) {
		pService.insert(t);
		teacherDao.insert(t);
		System.out.println("insert thanh cong !");
		
	}

	@Override
	public void update(Teacher t) {

		System.out.println("ID can sua: ");
		t.setId(new Scanner(System.in).nextInt());
		
		System.out.println("Email moi: ");
		t.setEmail(new Scanner(System.in).nextLine());
		
		teacherDao.update(t);
		System.out.println("update thanh cong !");
	}

	@Override
	public void delete(int id) {

		pService.delete(id);
		teacherDao.delete(id);
		System.out.println("delete thanh cong !");
	}

	@Override
	public List<Teacher> read() {
		return teacherDao.selectAll();
	}
	
}
