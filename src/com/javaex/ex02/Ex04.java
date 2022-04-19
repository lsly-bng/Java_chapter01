package com.javaex.ex02;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {

		/*
		 * 숫자부터 받고 이름을 받으면 enter도 같이 입력되어서 원하는 결과를 받지 못할 수도 있음. 버그 수정하려면 sc.nextLine();
		 * 입력하면 enter를 받은 것 처럼 처리하면 된다.
		 */

		Scanner sc = new Scanner(System.in);
		// 이름 부분
		System.out.println("이름을 입력해 주세요.");
		System.out.print("이름:");
		String name = sc.nextLine();
		// 나이부분
		System.out.println("나이를 입력해주세요.");
		System.out.print("나이:");
		int age = sc.nextInt();
		// 입력결과
		System.out.println("당신의 이름은 " + name + " 나이는 " + age + " 입니다.");

		sc.close();
	}
}
