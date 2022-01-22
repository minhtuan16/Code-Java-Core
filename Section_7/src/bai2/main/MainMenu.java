package bai2.main;

import java.util.Scanner;

import bai2.model.Developer;
import bai2.model.Leader;

public class MainMenu {
	public static void main(String[] args) {
		while(true) {
			System.out.println("Vui long chon !!!");
			System.out.println("1. Developer");
			System.out.println("2. Leader");
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			if(n == 1) {
				Developer();
				break;
			} else if(n == 2) {
				Leader();
				break;
			} else {
				System.out.println("Ban chua chon !");
			}
		}
		
	}
	
	public static void Developer() {
		System.out.println("1. Ban da chon Developer !");
		System.out.println("Nhap so Developer ban can: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		Developer[] developers = new Developer[n];
		for(int i = 0; i < developers.length; i++) {
			developers[i] = new Developer();
			developers[i].input();
		}
		
		for(Developer developer : developers) {
			developer.info();
		}
		
		System.out.println("\nThanh vien co su dung ngon ngu Java:");
		for(int i = 0; i < developers.length; i++) {
			
			if(developers[i].getProgramLanguage().equals("Java")) {
				developers[i].info();
			}
		}
	}
	
	
	public static void Leader() {
		System.out.println("2. Ban da chon Leader !");
		System.out.println("Nhap so Leader ban can: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		Leader[] leaders = new Leader[n];
		for(int i = 0; i < leaders.length; i++) {
			leaders[i] = new Leader();
			leaders[i].input();
		}
		
		for(Leader leader : leaders) {
			leader.info();
		}
		
		
		for(int i = 0; i < leaders.length; i++) {
			if(leaders[i].getTeamSize() > 10) {
				System.out.println("\nLeader co teamSize > 10: ");
				leaders[i].info();
			}
		}
		
		System.out.println("====");
		for(int i = 0; i < leaders.length; i++) {
			leaders[i].bonus();
		}
	}
}
