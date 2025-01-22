package assignment1;

import java.util.Arrays;

public class MultiplicationOfDigit {

	public static void main(String[] args) {
		int[] arr = {12,34,56};
		
		int[] digitProducts=new int[arr.length];
		
		for(int i=0;i<arr.length;i++) {
			digitProducts[i] = productOfDigits(arr[i]);
		}
		
		System.out.println("Original Array: "+ Arrays.toString(arr));
		
		System.out.println("Original Array: "+ Arrays.toString(digitProducts));
 
	}
	
	private static int productOfDigits(int num) {
		int product = 1;
		while(num > 0) {
			product *= num % 10;
			num /= 10;
		}
		return product;
	}

}
