package com.javaex.ex01;

public class Ex09 {

	public static void main (String[] args) {
		
		//관계 연산자 
		int n1 = 5;
		int n2 = 3;
		
		/*
		 * when you use > (more than) / < (less than) then the answer comes out as
		   either true or false.
		 */		
		System.out.println(n1<n2); //5<3 false
		System.out.println(n1>n2); //5>3 true
		
		/*
		 * when asking whether the variables are [less than or equal] use (<=).
		 * when asking whether the variables are [more than or equal] use (>=).
		 * when asking whether the variables are [equal] use (==).
		 * when asking whether the variables are [not equal] use (!=).
		 * '!' exclamation means 'not'. 
		 */		
		System.out.println(n1<=n2); //5<=3 false
		System.out.println(n1>=n2); //5>=3 true
		
		System.out.println(n1==n2); //5==3 false
		System.out.println(n1!=n2); //5!=3 true
		
		boolean result = n1<n2; 
		System.out.println(result); //false
	}
	
}
