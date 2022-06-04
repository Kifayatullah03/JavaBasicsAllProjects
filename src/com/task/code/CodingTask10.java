package com.task.code;

public class CodingTask10 {

	public static void main(String[] args) {
		
		//Question#10: Write a java program to find the second largest number in the array? 
		//please finish it by tomorrow evening.

		
		int [] nums = { 2 , 21 , 5 , 10};
		
		int x = 0;
		int y = 0;
		for(int z = 0; z < nums.length; z++) {
			if(nums[z] > x) {
				y = x;
				x  = nums[z];
			}else if (nums[z] > y) {
				y = nums[z];
			}
		
		}
		System.out.println("second large number"+y);
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//Question#10: Write a java program to find the third largest number in the array?
		
		int [] nums1 = { 1 ,7, 10, 6, 5};
			int t = 0;
			int e = 0;
			int p = 0;

			for(int z = 0; z < nums1.length; z++) {
				if(t < nums1[z]) {
					p = t;
					t = nums1[z];
					
				}else if(e > nums1[z]) {
					p =e;
					e = nums1[z];
				}else if(p < nums1[z]) {
					p = nums1[z];
				}
			
			}
			System.out.println("Third large number"+p);
			
		
		
		
		
		
		
		
		
		
	
									

}
}