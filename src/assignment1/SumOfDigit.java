package assignment1;

import java.util.Arrays;

public class SumOfDigit {

	public static void main(String[] args) {
		int[] arr= {123,456,789};
		
		int[]digitSums=new int[arr.length];
		
		for(int i=0;i<arr.length;i++) {
			digitSums[i]=sumOfDigit(arr[i]);
		}
		
		
			System.out.println("Original Array: "+ Arrays.toString(arr));
			
			System.out.println("Sum of Digits: "+ Arrays.toString(digitSums));
	}
	
		private static int sumOfDigit(int num) {
			int sum=0;
			while(num>0) {
				sum+= num % 10;
				num /= 10;
			}
			return sum;
		}
		
	}
	
