package assignment1;

import java.util.Arrays;

public class ReverseNumber {

	public static void main(String[] args) {
		int[] nums= {101,201,301,401,501};
		int[] reversed=new int[nums.length];
		for(int i=0;i<nums.length;i++) {
			reversed[i] = reverseNumber(nums[i]);
	
		}
		
		System.out.println("Original Array:"+Arrays.toString(nums));
		System.out.println("Reversed Array:"+Arrays.toString(reversed));
		
		

	}
	public static int reverseNumber(int num) {
		int rev=0;
		while(num!=0) {
			int digit=num%10;
			rev=rev*10+digit;
			num/=10;
		}
		return rev;
	}

}
