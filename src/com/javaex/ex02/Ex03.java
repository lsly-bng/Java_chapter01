package com.javaex.ex02;

import java.util.Scanner;

public class Ex03 {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		System.out.println("이름을 입력해 주세요.");
		System.out.print("이름:");
		String name = sc.nextLine();
		System.out.println("당신의 이름은 "+name+" 입니다.");
		
		sc.close();
	}
}
