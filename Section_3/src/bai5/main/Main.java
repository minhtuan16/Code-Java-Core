package bai5.main;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int j = 1000; j <= 9999; j++) {
//			
			if(SNT(j)) {
//				System.out.println(i);
				int[] mangSNT = new int[j];
				int max = mangSNT[0];
				for(int k = mangSNT[0]; k < mangSNT.length; k++) {
					if(max < mangSNT[k]) {
						max = mangSNT[k];
					}
				}
				System.out.println("SNT max = " + max);
			}
		}
	}
	
	public static boolean SNT(int n) {
		if(n < 2) {
			return false;
		} else {
			for(int i = 2; i <= Math.sqrt(n); i++) {
				if(n % i == 0) return false;
			}
		}
		return true;
	}

}
