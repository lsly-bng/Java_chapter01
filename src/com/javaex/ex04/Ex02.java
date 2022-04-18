package com.javaex.ex04;

import java.util.Scanner;

public class Ex02 {

	public static void main (String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("단을 입력하세요.");
		System.out.print("단: ");
		
		int dan = sc.nextInt();
		
		int i = 1; //초기값
		
		while(i<=9) {
			System.out.println(dan+" * "+i+" = "+dan*i);
			i++; //i=i+1 이라는 의미 
		}		
		
		sc.close();
		
	}
}
