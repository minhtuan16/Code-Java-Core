package model;

public class Ticket implements Runnable {

	private int ticket = 2;

	@Override
	public void run() {
		try {
			muaVe();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
	}

	public synchronized void muaVe() throws InterruptedException {
		/*
		 * try { 
		 * 		ticket = ticket - 1; 
		 * 		Thread.sleep(1000);
		 * 		System.out.println(Thread.currentThread().getName()); 
		 * 		if(ticket > 0) {
		 * 			System.out.println("Mua duoc ve"); 
		 * 		} else { 
		 * 			System.out.println("Het ve"); 
		 * 		} 
		 * } catch (InterruptedException e) { 
		 * 		e.printStackTrace(); 
		 * }
		 */

//		**** Hoac ****

		ticket = ticket - 1;
		Thread.sleep(1000);
		if (ticket > 0) {
			System.out.println(Thread.currentThread().getName() + " : Mua duoc ve");
		} else {
			System.out.println(Thread.currentThread().getName() + " : Khong mua duoc ve");
		}

	}

}
