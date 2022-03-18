package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Person;
import service.ListExamService;
import service.ListExamServiceIMPL;
import service.PersonService;
import service.PersonServiceIMPL;

public class MainListExam {

	public static void main(String[] args) {
		
		ListExamService examService = new ListExamServiceIMPL();
		List<Person> list = examService.input();
	
		
		System.out.println("-------------");
		examService.info(list);
		
		System.out.println("---------");
		examService.filter(list);
		
		System.out.println("---------");
		examService.sortPerson(list);
		
		System.out.println("---------");
		examService.delete(list);
		
	}
	
}
