package com.javaex.ex05;

public class Ex03 {

	public static void main (String[]args) {

		int[] nums = new int[6];
		
		/*
		nums[0] = (int)(Math.random()*45)+1;
		nums[1] = (int)(Math.random()*45)+1;
		nums[2] = (int)(Math.random()*45)+1;
		nums[3] = (int)(Math.random()*45)+1;
		nums[4] = (int)(Math.random()*45)+1;
		nums[5] = (int)(Math.random()*45)+1;
		*/
		
		for (int i=0; i<6; i++) {
			nums[i] = (int)(Math.random()*45)+1;
		}
		
		System.out.println(nums[0]);
		System.out.println(nums[4]);
		System.out.println("===============");
		
		for(int i=0; i<6; i++) {
			System.out.println(nums[i]);
		}
	}
}
