package com.javaex.ex01;

public class Ex10 {

	public static void main (String[] args) {
		
		/*
		 * '&&' ampersand-ampersand means 'and'.
		 * '||' (right shift+\) vertical bar-vertical bar means 'or'.
		 * '!' exclamation means 'not'.
		 * 'deadcode' error means that there's no point in calculating cause the answer is a given. 
		 */		
		
		//논리연산자
		int a = 5; 
		int b = 7;
		
		//논리 연산자 기본 &&
		System.out.println("&& 연산자");
		System.out.println("=======================");
		System.out.println(true&&true); //true
		System.out.println(true&&false); //false
		System.out.println(false&&true); //false
		System.out.println(false&&false); //false
		
		//논리 연산자 기본 ||
		System.out.println("|| 연산자");
		System.out.println("=======================");
		System.out.println(true||true); //true
		System.out.println(true||false); //true
		System.out.println(false||false); //true
		System.out.println(false||false); //false
	
		System.out.println("응용");
		System.out.println("=======================");
		System.out.println((a>b)&&(a<b)); //(5>7) and (5<7) --> (F) and (T) = F
		System.out.println((a>b)&&(a>b)); //(5>7) and (5>7) --> (F) and (F) = F
		
		System.out.println("=======================");
		System.out.println((a>b)||(a>b)); //(5>7) or (5>7) --> (F) or (T) = T
		System.out.println((a>b)||(a>b)); //(5>7) or (5>7) --> (F) or (F) = F
		
		//논리 연산자 기본 !
		System.out.println("=======================");
		System.out.println(a>b); //(5>7) = F
		System.out.println(!(a>b)); //not (5>7) = T
		
		System.out.println("=======================");
		System.out.println(a<b); //(5<7) = T
		System.out.println(!(a<b)); //not (5<7) = F
		
		
	}
}
