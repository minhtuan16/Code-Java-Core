package service;

import java.util.Scanner;

import model.Dictionary;

public class DictionaryServiceIMPL implements DictionaryService{

	@Override
	public void input(Dictionary dictionary) {
		System.out.println("Nhap keyWord:");
		dictionary.setKeyWord(new Scanner(System.in).nextLine());
		
		System.out.println("Nhap descripttion:");
		dictionary.setDescription(new Scanner(System.in).nextLine());
		
		System.out.println("Nhap word type: ");
		dictionary.setWordType(new Scanner(System.in).nextLine());
		
	}

	@Override
	public void info(Dictionary dictionary) {
		System.out.println("\n");
		System.out.println("KeyWord: " + dictionary.getKeyWord());
		System.out.println("Description: " + dictionary.getDescription());
		System.out.println("Word Type: " + dictionary.getWordType());
		
	}

	
}
