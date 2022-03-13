package bai2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class MainProduct {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		luuDoiTuong();
		ListProduct();
	}
	
	public static void luuDoiTuong() throws IOException, ClassNotFoundException {
		File dir = new File("Bai2");
		dir.mkdir();
		
		File file = new File("Bai2/DoiTuong.txt");
		if(!file.exists()) {
			file.createNewFile();
		}
		Product product = new Product();
		
		ProductServiceIMPL productServiceIMPL = new ProductServiceIMPL();
		productServiceIMPL.input(product);
		
		FileOutputStream fileOutputStream = new FileOutputStream(file);
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(product);
		System.out.println("Luu thanh cong");
		
		objectOutputStream.close();
		fileOutputStream.close();
		
		FileInputStream fileInputStream = new FileInputStream(file);
		
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		
		Product pro = (Product) objectInputStream.readObject(); // ep kieu roi tra lai doi tuong
		productServiceIMPL.info(pro);
		
	}
	
	public static void ListProduct() throws IOException, ClassNotFoundException {
		File dir = new File("ListProduct");
		dir.mkdir();
		
		File file = new File("ListProduct/Danh sach.txt");
		
		if(!file.exists()) {
			file.createNewFile();
		}
		
		//tao doi tuong

		ProductServiceIMPL productServiceIMPL = new ProductServiceIMPL();
		Product[] pros = productServiceIMPL.inputList();
		
		//ghi vao file
		FileOutputStream fileOutputStream = new FileOutputStream(file);
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(pros);
		
		objectOutputStream.close();
		fileOutputStream.close();
		
		System.out.println("Luu thanh cong danh sach");
		
		//doc tu file ra man hinh console
		FileInputStream fileInputStream = new FileInputStream(file);
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		Product[] pro1 = (Product[]) objectInputStream.readObject();
		productServiceIMPL.infoList(pro1);
		
		objectInputStream.close();
		fileInputStream.close();
	}
}
