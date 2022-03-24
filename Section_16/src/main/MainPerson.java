package main;

import java.util.HashSet;
import java.util.Set;

import model.Person;
import service.SetExamService;
import service.SetExamServiceImpl;

public class MainPerson {

	public static void main(String[] args) {
		SetExamService examService = new SetExamServiceImpl();
		Set<Person> set = examService.input();
		
		examService.info(set);
		
		examService.filter(set);
		
		examService.delete(set);
	}
}
