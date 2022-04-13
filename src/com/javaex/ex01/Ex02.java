/*
작성자 : 방희원
작성일 : 2022-04-13
*/

//오늘의 수업은 8가지 기본자료형 종류 소개 + Spring (나중에 더 배울 예정)

/* Learning 8+a <PRIMITIVE DATA TYPES> : 
 * 논리형 : boolean [1byte] use <true> or <false> / e.g. boolean ooo = true;
 * 문자형 : char [2byte] character / 모든유니코드 문자 / e.g. char ooo = 'f';
 * 정수형 : byte [1byte] -128 ~ +127 (0 is counted) / e.g. byte ooo = 89;
 *  	  short [2byte] -32,769 ~ +32,767 / e.g. short ooo = 32760
 *        int  [4byte] -2147483648 ~ +2147483647 / int ooo = 59;
 *        long [8byte] -9223372036854775808 ~ +9223372036854775807 (end with L) / long ooo = 345678912345L;
 * 실수형 : float [4byte] -3.4E38 ~ 3.4E38 (end with F) / float ooo = 32.5F
 * 		  double [8byte] -1.7E308 ~ 1.7E308 / double ooo = 23.34
 * 
 * Spring ooo = "안녕하세요"; (must include "")
*/

/////////////////////////////////////////////////////////////////////////

package com.javaex.ex01;

public class Ex02 {

	public static void main(String[] args) {

/////////////////////////////////////////////////////////////////////////		
		
		double var01 = 3.14;
		
		// Must write 'F' at the end of 'float'
		// Use variables that has more bits (double > float) 
		// Float -> has to write F in the end - inconvenient
		
		float var02 = 3.14F;
		System.out.println(var01);
		System.out.println(var02);
		
		double var03 = 0.1234567890123456789;
		float var04 = 0.1234567890123456789f;
		
		System.out.println (var03);
		System.out.println (var04);
		
		
	}
}
