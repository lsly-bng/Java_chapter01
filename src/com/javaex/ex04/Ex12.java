package com.javaex.ex04;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("숫자를 입력하세요. [0이면 종료.]");

		int num;
		int sum = 0; // 합계

		// do~while
		do {
			num = sc.nextInt(); // 입력받은값
			sum = sum + num;
			System.out.println("합계: " + sum);
		} while (num != 0);

		// alternative (1)
		System.out.println("========================");

		while (true) {
			num = sc.nextInt(); // 입력받은값
			sum = sum + num;
			System.out.println("합계: " + sum);
			if (num == 0) {
				break;
			}
		}
		System.out.println("종료.");
		sc.close();
	}
}
