package com.javaex.ex02;

public class Ex01 {

	public static void main(String[] args) {

		/*
		 * println --> print line(ln) --> 'ln' 줄바꿈을 하고 끝내라는 명령어 print --> print -->
		 * prints within the same line. 문자에도 '+' 사용 가능 --> '+' when used with text
		 * contents it adds the contents of the variable within the line without space.
		 * You can use the " " to create blank spaces. when you use 'char' to connect
		 * characters--> e.g. c+c --> it would result in printing the character once +
		 * the actual numerical value. '\n' (backslash n)= 줄바꿈 used within "" --> e.g.
		 * "안녕\n하세요". '\t' (backslash t)= tab used within "" --> e.g. "안녕\t하세요"
		 * '\"' (backslash ")= quotation within "" --> e.g. "안녕\"하\"세요" '\\' (backslash
		 * backslash)= backslash within "" --> e.g. "안녕\\하\\세요" '\' => backslash within
		 * "" --> states that we will use a 특수기호?
		 */

		int i = 2345;
		double d = 3.14;
		char c = '한';

		String s = "한";
		String str = "good morning";
		String name = "방희원";

		System.out.println("안녕하세요");
		System.out.println(str);

		System.out.print("안녕");
		System.out.println("하세요");

		System.out.println(str + str + "잘지내시나요");
		System.out.println(str + i);
		String var01 = str + i;
		System.out.println(str + " 랑 " + i);

		System.out.println(str + " " + d);

		System.out.println(i + i);
		System.out.println(d + d);
		System.out.println(i + d);

		System.out.println(c);
		System.out.println(c + c); // 주의사항 (숫자로 연산됨 - 보통 원하는 결과 아님)

		System.out.println(s);
		System.out.println(s + s);

		System.out.println("제 이름은 " + name + " 입니다.");

		System.out.println("=======================");
		System.out.println("안녕\n하세요");
		System.out.println("안녕\t하세요");
		System.out.println("안\t하세요");
		System.out.println("안녕히\t가세요");

		System.out.println("안녕\"하\"세요");
		System.out.println("안녕\\하\\세요");
	}
}
