package bai2.main;

import exception.ZeroException;

public class MainZeroException {

	public static void main(String[] args) {
		try {
			chia2So(10, 0);
		} catch (ZeroException e) {
			System.out.println(e.getError());
		}
	}

	public static void chia2So(int a, int b) throws ZeroException {
		try {
			int kq = a / b;

			System.out.println("Kq = " + kq);
		} catch (Exception e) {
			throw new ZeroException("Loi: chia cho 0");
		}
	}
}
