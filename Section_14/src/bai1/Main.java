package bai1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		
		writeFile();
		
		System.out.println(readFile());
//		readFile();
		
		appendFile();
	}
	public static void writeFile() throws IOException {
		File file = new File("test.txt");
			
		if(!file.exists()) {
			file.createNewFile();
		}
		
		String s = "Hello Trung Tam Java - File";
		
		FileOutputStream fileOutputStream = new FileOutputStream(file);
		fileOutputStream.write(s.getBytes());
		
		fileOutputStream.close();
	}
		
	public static String readFile() throws IOException {
		File file = new File("test.txt");
		
		if(!file.exists()) {
			file.createNewFile();
		}
		
		String s = "";
		FileInputStream fileInputStream = new FileInputStream(file);
		int c = fileInputStream.read();
		
		while(c != -1) {
			s += (char) c;
//			System.out.println((char) c);
			c = fileInputStream.read();
		}
		fileInputStream.close();
		return s;
	}
	
	public static void appendFile() throws IOException {
//		File file = new File("test.txt");
//		
//		if(!file.exists()) {
//			file.createNewFile();
//		}
//		
//		FileInputStream fileInputStream = new FileInputStream(file);
//		int c = fileInputStream.read();
//		while (c != -1) {
//			System.out.print((char) c);
//			c = fileInputStream.read(); 
//		}
//		fileInputStream.close();
//		return (String) c;
		
//		String s = ". I am here.";
//		FileOutputStream fileOutputStream = new FileOutputStream(file);
//		fileOutputStream.write(s.getBytes());
//		fileOutputStream.close();

		String a = readFile() + ". I am here.";
		
		File dir = new File("Hello");
		dir.mkdir();
		
		File file1 = new File("Hello/demo.txt");
		
		if(!file1.exists()) {
			file1.createNewFile();
		}
		
		FileOutputStream fileOutputStream2 = new FileOutputStream(file1);
		fileOutputStream2.write(a.getBytes());
		fileOutputStream2.close();
		
		FileInputStream fileInputStream = new FileInputStream(file1);
		int c = fileInputStream.read();
		while(c != -1) {
			System.out.print((char) c);
			c = fileInputStream.read();
		}
		fileInputStream.close();
	}
}
