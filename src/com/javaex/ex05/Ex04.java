package com.javaex.ex05;

public class Ex04 {

	public static void main(String[] args) {
		
		int[] intArray = new int[5];
		intArray[0]=3;
		intArray[1]=6;
		intArray[2]=9;
		
		for(int i=0; i<intArray.length; i++) {
			System.out.println(intArray[i]);
		}
		
		//======================================
		
		/* alternative (1)
		int[] intArray=new int[] {3,6,9};
		
		for(int i=0; i<intArray.length; i++) {
			System.out.println(intArray[i]);
		}
		*/
		
		//=======================================
		
		/* alternative (2)
		//지금 단계에서는 추천하지 않는 방법.
		int[] intArray= {3,6,9};
		for(int i=0; i<intArray.length; i++) {
			System.out.println(intArray[i]);
		}
		*/
		
		//========================================
		
		//double 
		System.out.println("========================");
		
		double[] dArray=new double [5];
		dArray[0]=1.5;
		dArray[1]=5.33;
		dArray[2]=6.82;
		
		for (int i=0; i<dArray.length; i++) {
			System.out.println(dArray[i]);
		}
		
		//========================================
		
		//character
		System.out.println("========================");
		
		char[] cArray = new char[7];
		cArray[0] = 'H';
		cArray[1] = 'E';
		cArray[2] = 'L';
		cArray[3] = 'L';
		cArray[4] = 76; //조심
				
		for(int i=0; i<cArray.length; i++) {
			System.out.println(cArray[i]);
		}
		
		//========================================
		
		//boolean
		System.out.println("========================");
		
		boolean[] bArray = new boolean[4];
		
		bArray[0]=true;
		bArray[1]=false;
		bArray[2]=3==5;
		
		for(int i=0; i<bArray.length; i++) {
			System.out.println(bArray[i]);
		}
	}
}
