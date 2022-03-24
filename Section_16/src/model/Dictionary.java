package model;

import java.util.Scanner;

public class Dictionary {

	private String keyWord;
	private String description;
	private String wordType;
	
	public Dictionary() {
		// TODO Auto-generated constructor stub
	}
	public Dictionary(String keyWord, String description, String wordType) {
		super();
		this.keyWord = keyWord;
		this.description = description;
		this.wordType = wordType;
	}
	public String getKeyWord() {
		return keyWord;
	}
	public void setKeyWord(String keyWord) {
		this.keyWord = keyWord;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getWordType() {
		return wordType;
	}
	public void setWordType(String wordType) {
		this.wordType = wordType;
	}
	
//	@Override
//	public boolean equals(Object obj) {
//		return (((Dictionary) obj).get);
//	}
	
//	//input
//	public void input() {
//		System.out.println("Nhap keyWord:");
//		keyWord = new Scanner(System.in).nextLine();
//		
//		System.out.println("Nhap descripttion:");
//		this.description = new Scanner(System.in).nextLine();
//		
//		System.out.println("Nhap word type: ");
//		this.wordType = new Scanner(System.in).nextLine(); 
//	}
	
//	public void info() {
//		System.out.println("\n");
//		System.out.println("KeyWord: " + this.keyWord);
//		System.out.println("Description: " + this.description);
//		System.out.println("Word Type: " + this.wordType);
//	}
}
