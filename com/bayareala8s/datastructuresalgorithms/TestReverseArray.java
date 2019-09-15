package com.bayareala8s.datastructuresalgorithms;

public class TestReverseArray {
	public static void main(String[] args) {
		
		int[] nums = {1,2,3,4};
		
		ReverseArray rArray = new ReverseArray();

		int[] reversedArray = rArray.reverseArray(nums);

		for(int i=0; i < reversedArray.length;i++) {
			System.out.print(reversedArray[i]+" ");
		}
	}
}
