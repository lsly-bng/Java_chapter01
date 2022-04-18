package com.javaex.ex04;

import java.util.Scanner;

public class Ex03 {

	public static void main (String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("단을 입력하세요.");
		System.out.print("단: ");
		
		int dan = sc.nextInt();
		
		for (int num=1; num<=9; num++) {
			System.out.println(dan+" * "+num+" = "+dan*num);
		}
		
		
		sc.close();
		
	}
}
