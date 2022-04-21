package com.javaex.ex05;

public class Ex01 {

	public static void main (String[]args) {

		/* 랜덤함수 예제 1~10까지 수
		 * int num = (int)(Math.random()*10)+1; System.out.println(num);
		 */	
		
		//미니 로또
		int lotto1 = (int)(Math.random()*45)+1; 
		int lotto2 = (int)(Math.random()*45)+1; 
		int lotto3 = (int)(Math.random()*45)+1; 
		int lotto4 = (int)(Math.random()*45)+1; 
		int lotto5 = (int)(Math.random()*45)+1; 
		int lotto6 = (int)(Math.random()*45)+1; 
		
		System.out.print(lotto1+" ");
		System.out.print(lotto2+" ");
		System.out.print(lotto3+" ");
		System.out.print(lotto4+" ");
		System.out.print(lotto5+" ");
		System.out.print(lotto6+" ");
		
		System.out.print("=======================");
		
		for (int i=1; i<=6; i++) {
			System.out.println("lotto"+i);
		}
	}
}
