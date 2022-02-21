package bai2.main;

import java.util.Scanner;

import bai2.model.Car;
import bai2.model.PhuongTien;
import bai2.model.Train;

public class Main {
	public static void main(String[] args) {
//		Train t = new Train();
//		Car c = new Car();
//
//		input(t);
//		info(t);
//
//		input(c);
//		info(c);

		while (true) {
			System.out.println("Vui long chon !");
			System.out.println("1.Train");
			System.out.println("2.Car");
			System.out.println("3.Exit");

			int n = new Scanner(System.in).nextInt();

			if (n == 1) {
				System.out.println("1.Train");
				menuTrain();
				break;
			} else if (n == 2) {
				System.out.println("2.Car");
				menuCar();
				break;
			} else if (n == 3) {
				System.out.println("3.Exit");
				System.exit(n);
			} else {
				System.out.println("Ban chua chon !!!");
			}
		}
	}

	public static void input(PhuongTien pt) {
		System.out.println("Nhap gia ve: ");
		pt.setGiaVe(new Scanner(System.in).nextInt());

		System.out.println("Nhap so ghe: ");
		pt.setSoGhe(new Scanner(System.in).nextInt());

		if (pt instanceof Train) {
			Train t = (Train) pt;

			System.out.println("Nhap so toa: ");
			t.setSoToa(new Scanner(System.in).nextInt());
		}

		if (pt instanceof Car) {
			Car c = (Car) pt;

			System.out.println("Nhap loai xe: ");
			c.setLoaiXe(new Scanner(System.in).nextLine());
		}
	}

	public static void info(PhuongTien pt) {
		System.out.println("--------------");

		if (pt instanceof Train) {
			Train t = (Train) pt;

			System.out.println(
					"Gia ve: " + pt.getGiaVe() + "| " + "So ghe: " + pt.getSoGhe() + " | " + "So toa: " + t.getSoToa());
		}

		if (pt instanceof Car) {
			Car c = (Car) pt;

			System.out.println("Gia ve: " + pt.getGiaVe() + "| " + "So ghe: " + pt.getSoGhe() + " | " + "Loai xe: "
					+ c.getLoaiXe());
		}
	}

	public static void menuTrain() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so luong tau: ");
		int n = sc.nextInt();

		Train[] trains = new Train[n];
		for (int i = 0; i < trains.length; i++) {
			trains[i] = new Train();
			input(trains[i]);
		}

		for (Train train : trains) {
			info(train);
		}
	}

	public static void menuCar() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so luong xe oto: ");
		int m = sc.nextInt();

		Car[] cars = new Car[m];
		for (int i = 0; i < cars.length; i++) {
			cars[i] = new Car();
			input(cars[i]);
		}

		for (Car car : cars) {
			info(car);
		}
	}
}
