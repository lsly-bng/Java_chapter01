package com.javaex.ex03;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	
		System.out.print("점수를 입력하세요:");
		int point = sc.nextInt();
		
		/* alternative (1) : 
		 * if(point>=90) {System.out.println("A등급");}
		 * else if(point>=80) {System.out.println("B등급");} 
		 * else if(point>=70) {System.out.println("C등급");}
		 * else if(point>=60) { System.out.println("D등급");}
		 * else { System.out.println("F등급");}
		 */
		
		/* Lecture notes (alternative (2)):  
		 * if(point>=90) {System.out.println("A등급");}
		   else if(90>point && point>=80) {System.out.println("B등급");}
		   		   //90>85 (T) && (T) 85>=80 -->T&&T-->T 85점일때
		   		   //90>75 (T) && (T) 75>=80 -->T&&F-->F 75점일때
		   else if(80>point && point>=70) {System.out.println("C등급");}
		   else if(70>point && point>=60) {System.out.println("D등급");}
		   else {System.out.println("F등급");}
		 */ 
		
		//better option(?) :
		System.out.print((point>=90)?"A등급": (point>=80)?"B등급": (point>=70)?"C등급": (point>=60)?"D등급": "F등급");
		
		sc.close();
	}

}
