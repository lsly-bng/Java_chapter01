// 작성자 : 방희원
// 작성일 : 2022-04-13

//오늘의 수업은 8가지 기본자료형 종류 소개 + Spring (나중에 더 배울 예정)

/* Learning 8+a <PRIMITIVE DATA TYPES> : 
 * 논리형 : boolean [1byte] use <true> or <false> / e.g. boolean ooo = true;
 * 문자형 : char [2byte] character / 모든유니코드 문자 / e.g. char ooo = 'f';
 * 정수형 : byte [1byte] -128 ~ +127 (0 is counted) / e.g. byte ooo = 89;
  	  	  short [2byte] -32,769 ~ +32,767 / e.g. short ooo = 32760;
   	  	  int  [4byte] -2147483648 ~ +2147483647 / int ooo = 59;
   	  	  long [8byte] -9223372036854775808 ~ +9223372036854775807 (end with L) / long ooo = 345678912345L;
 * 실수형 : float [4byte] -3.4E38 ~ 3.4E38 (end with F) / float ooo = 32.5F;
   	  	   double [8byte] -1.7E308 ~ 1.7E308 / double ooo = 23.34;
 
 ** Spring ooo = "안녕하세요"; (must include "") / 나중에 더 배울 예정 **
*/

/////////////////////////////////////////////////////////////////////////
// JAVA_EX04_2022-04-13 \\
/////////////////////////////////////////////////////////////////////////

package com.javaex.ex01;

public class Ex04 {

	public static void main(String[] args) {

		// When printing 'one' letter use the ''.
		char ch01 = 'A';
		char ch02 = '안';

		System.out.println(ch01);
		System.out.println(ch02);

		// Shouldn't do this ...? cause it won't print?
		char ch03 = 65;
		System.out.println(ch03);

		char ch04 = '3';
		System.out.println(ch04);

		// String 을 사용하여 한 글자 이상 작성 -> Have to use "" and only ""
		// 실제로 String 활용도가 높다. 그러나 char 있다는 것은 인지해야 할 것

		String str = "안녕하세요";
		System.out.println(str);
	}
}
