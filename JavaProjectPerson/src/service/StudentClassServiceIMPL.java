package service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dao.ClazzDAO;
import dao.ClazzDAOIMPL;
import dao.CourseDAO;
import dao.CourseDAOIMPL;
import dao.StudentClassDao;
import dao.StudentClassDaoIMPL;
import model.Clazz;
import model.Course;
import model.StudentClass;

public class StudentClassServiceIMPL implements StudentClassService {


	StudentClassDao scDao = new StudentClassDaoIMPL();
	@Override
	public void input(StudentClass sc) {

		while(true) {
			try {
				System.out.println("StudentClass so SV: ");
				sc.setSoSV(new Scanner(System.in).nextInt());
				
				Clazz c = new Clazz();
				System.out.println("StudentClass id_clazz: ");
				c.setId(new Scanner(System.in).nextInt());
				
				sc.setClazz(c);
				
				break;
			} catch (Exception e) {
				System.out.println("nhap sai ! nhap lai");
			}
			
			
		}
	}

	@Override
	public void info(StudentClass sc) {

		System.out.println("StudentClass ID: " + sc.getSoSV());
	
		if(sc.getClazz() != null) { // check course xem da ton tai chua
			System.out.println("Clazz:");
			ClazzService clazzService = new ClazzServiceIMPL();
			clazzService.info(sc.getClazz());
		}
		System.out.println("-------");
	}

	@Override
	public void insert(StudentClass sc) { // them course vao database (db)

		System.out.println("Dua vao MySQL thanh cong !");
		scDao.add(sc);
	}

	@Override
	public void update(StudentClass sc) {
		
		System.out.println("Cap nhat tren MySQL thanh cong !");
		scDao.update(sc);
	}

	@Override
	public void delete(int id_clazz) {

		System.out.println("Xoa tren MySQL thanh cong !");
		scDao.delete(id_clazz);
	}

	@Override
	public List<StudentClass> getAll() {
		
		return scDao.selectAll();
	}

	@Override
	public List<StudentClass> searchClazzName(String ClazzName) {
		return scDao.searchClazzName(ClazzName);
	}
	

}
