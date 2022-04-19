package com.javaex.ex01;

public class Ex08 {

	public static void main(String[] args) {

		// 대입연산자
		int a = 7;
		int b = 2;
		System.out.println("산술연산자");

		// 산술연산자
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);

		System.out.println(a / b); // 정수 나누기 정수는 ---> 정수
		System.out.println(a % b); // 나머지

		// 산술연산자 / % 자세히
		System.out.println("산술연산자 / % 자세히");
		System.out.println(7 / 2); // 3
		System.out.println(7.0 / 2.0); // 3.5
		System.out.println(7 % 2);// 1
		System.out.println(7.0 % 2.0);// 1.0

		// 부호 연산자
		int var = -3;
		int pvar = +var; // -3
		int mvar = -var; // 3
		System.out.println(pvar);
		System.out.println(mvar);

		// 증감 연산자

		/* 앞에 ++ */
		System.out.println("증감연산자");
		System.out.println(a); // 7
		System.out.println(++a); // 8 < 지금 바꿔라?
		System.out.println(a); // 8

		/* 앞에 -- */
		System.out.println(b); // 2
		System.out.println(--b); // 1
		System.out.println(b); // 1

		/* 뒤에 ++ */
		System.out.println(a); // 8
		System.out.println(a++); // 8 < 뒤에 붙이는 ++ 는 a 값을 제일 마지막에 올리라는 의미?
		System.out.println(a); // 9

		/* 뒤에 -- */
		System.out.println(b); // 1
		System.out.println(b--); // 1 <--본인 출력하고 다음부터 줄이라는 의미?
		System.out.println(b); // 0
	}
}
