package main;

import model.MyThread;

public class MainThread {

	public static void main(String[] args) {
		Thread[] threads = new Thread[10];

		for (int i = 0; i < threads.length; i++) {
			threads[i] = new MyThread();
		}

		for (Thread thread : threads) {
			thread.start();
		}
	}
}
