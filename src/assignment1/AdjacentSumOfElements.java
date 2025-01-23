package assignment1;

import java.util.Arrays;

public class AdjacentSumOfElements {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6};
		
		int n=arr.length;
		
		int[] AdjacentSum=new int[(n+1)/2];
		
		for(int i=0;i<(n+1)/2;i++) {
			AdjacentSum[i]=arr[i] + arr[n-1-i];
		}
		
		System.out.println("Sum of Adjacent Elements are: "+Arrays.toString(AdjacentSum));

	}

}
