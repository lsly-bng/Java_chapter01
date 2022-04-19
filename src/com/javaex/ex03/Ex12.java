package com.javaex.ex03;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("월을 입력하세요:");
		int month = sc.nextInt();

		switch (month) {
		case 1:
			System.out.println("31일");
			break;
		case 2:
			System.out.println("28일");
			break;
		case 3:
			System.out.println("31일");
			break;
		case 4:
			System.out.println("30일");
			break;
		case 5:
			System.out.println("31일");
			break;
		case 6:
			System.out.println("30일");
			break;
		case 7:
			System.out.println("31일");
			break;
		case 8:
			System.out.println("31일");
			break;
		case 9:
			System.out.println("30일");
			break;
		case 10:
			System.out.println("31일");
			break;
		case 11:
			System.out.println("30일");
			break;
		case 12:
			System.out.println("31일");
			break;
		default:
			System.out.println("해당 월이 존재하지 않습니다.");
			break;
		}

		/*
		 * //alternative (1) :
		 * 
		 * switch (month) { case 4: case 6: case 9: case 11: System.out.print("30일");
		 * break; case 2: System.out.print("28일"); break; default:
		 * System.out.print("31일"); break; }
		 * 
		 * //그렇지만 이렇게하면 default 값 때문에 1~12 범위 이외 숫자 입력시 default 값인 31일이 나온다. //하지만 이런
		 * 방법으로 응용할 수 있다고 인지하고 있으면 된다.
		 */

		/*
		 * //alternative (2) : //if 와 || (or) 사용
		 * 
		 * if ((month==4) || (month==6) || (month==9) || (month==11))
		 * {System.out.print("30일");} else if (month==2) {System.out.print("28일");} else
		 * {System.out.print("31일");}
		 * 
		 * //위 방법과 같이 default 값이 문제 --> 그러나 이런 방법도 있음.
		 */

		sc.close();
	}
}
