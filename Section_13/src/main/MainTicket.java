package main;

import model.Ticket;

public class MainTicket {

	public static void main(String[] args) {
		Ticket ticket = new Ticket();

		Thread t1 = new Thread(ticket);
		t1.setName("A");

		Thread t2 = new Thread(ticket);
		t2.setName("B");

		t1.start();
		t2.start();
	}
}
