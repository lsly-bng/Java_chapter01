package com.javaex.ex05;

public class Ex07 {

	public static void main(String[] args) {
		
		// A 배열 선언 {0
		int[] leftArray=new int[] {10,20,30};
		int[] rightArray=new int[] {10,40,10};
		
		if(leftArray.length==rightArray.length) { //두배열의 개수가 같니?
			//같으면 세부검사
			System.out.println("세부검사");
			for (int i=0; i<leftArray.length; i++) {
				if (leftArray[i]!=rightArray[i]) {
					//다르면
					System.out.println(i+"번째 값이 다릅니다.");
				}
			}
		} else {
			System.out.println("두배열의 크기가 다릅니다.");
		}
	}
}
