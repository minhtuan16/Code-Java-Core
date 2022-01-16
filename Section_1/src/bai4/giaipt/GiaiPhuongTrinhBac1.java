package bai4.giaipt;

public class GiaiPhuongTrinhBac1 {
	public static double phuongTrinhBac1(double a, double b) {
		if(a == 0) {
			if(b == 0) {
				System.out.println("PT co vo so nghiem");
			} else {
				System.out.println("PT vo nghiem");
			}
		} 
		double x = -b/a;
		return x;
	}
}
