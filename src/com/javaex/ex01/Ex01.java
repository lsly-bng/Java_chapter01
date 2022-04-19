// 작성자 : 방희원
// 작성일 : 2022-04-13

//오늘의 수업은 8가지 기본자료형 종류 소개 + Spring (나중에 더 배울 예정)

/* Learning 8+a <PRIMITIVE DATA TYPES> : 
 * A primitive data type specifies the size and type of variable values, and it has no additional methods.
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
// JAVA_EX01_2022-04-13 \\
/////////////////////////////////////////////////////////////////////////

package com.javaex.ex01;

public class Ex01 {

	public static void main(String[] args) {

		// 변수 선언 + 초기화를 한번에 한 케이스
		int myAge = 25;

		/*
		 * int myAge; //변수선언 myAge=25; //초기화
		 */

		// 메모리의 값을 출력하는 메소드
		System.out.println(myAge);

		myAge = 26;
		System.out.println(myAge);

/////////////////////////////////////////////////////////////////////////
		// NOTES (BYTE, SHORT, INT, LONG)\\
/////////////////////////////////////////////////////////////////////////

		/*
		 * //1byte == 8bit (_ _ _ _ _ _ _ _) [only use 0 or 1] //first box defines
		 * whether it's a plus (+) [0] / minus (-) [1] //but - the actual number begins
		 * from the back e.g. 00011001 == 25 //you can write up to '256' numbers in 1
		 * byte = 8bits including 0 (from -128 to 127) //byte = 1 byte / short = 2byte /
		 * int = 4 byte / long = 8byte
		 * 
		 * byte no; no = -128; System.out.println(no);
		 * 
		 * 
		 * //when using 'long', you have to add "L" at the end of the number. but if the
		 * //number is below 'int' then you don't have to add the "L" at the end. "L"은
		 * //'int' 범위를 벗어나는 경우 붙인다.
		 * 
		 * long no2; no2 = 2147483648L; System.out.println(no2);
		 */

/////////////////////////////////////////////////////////////////////////
		// 변수선언 (declaration) , 초기화 (initialization) \\
/////////////////////////////////////////////////////////////////////////		

		// 변수 여러개일떄 선언후 초기화
		int var01;
		int var02;
		int var03;

		/* alternative ↑ : int var01, var02, var03; */

		var01 = 10;
		var02 = 20;
		var03 = 30;

		// 변수 여러개일때 변수선언 + 초기화

		int var04 = 10;
		int var05 = 20;
		int var06 = 30;

		/* alternative: int var04=10, var05=20, var06=30; */

		System.out.println(var04);
	}
}
