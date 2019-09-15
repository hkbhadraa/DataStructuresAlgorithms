package com.bayareala8s.datastructuresalgorithms;

public class ReverseArray {

	//the running time complexity is O(N) + in-place algorithm (no need for extra memory)
	public int[] reverseArray(int[] nums) {
		
		//pointer to the first item
		int startIndex = 0;
		//pointer to the last item
		int endIndex = nums.length-1;

		//we swap 2 items in 1 iteration: so we just have to make N/2 iterations
		while(endIndex > startIndex) {
			
			//swap 2 items with index startIndex & endIndex
			swap(nums,startIndex,endIndex);
			
			//increment & decrement the indexes
			startIndex++;
			endIndex--;
		}
		return nums;
	}


	private void swap(int[] nums, int startIndex, int endIndex) {
		int temp = nums[startIndex];
		nums[startIndex] = nums[endIndex];
		nums[endIndex] = temp;
	}
}		
			


