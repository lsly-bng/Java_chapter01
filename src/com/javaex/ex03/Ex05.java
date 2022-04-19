package com.javaex.ex03;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("근무시간:");
		int time = sc.nextInt();

		int pay;

		if (time <= 8) {
			pay = time * 10000;
		}
		else {
			pay = 8 * 10000 + (time - 8) * 12000;
		}
		System.out.println("임금은 " + pay + " 입니다.");
		sc.close();
	}
}
