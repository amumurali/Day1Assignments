package Week1Day2Assignments;

import java.util.Arrays;

public class SecSmalleststNo {

	public static void main(String[] args) {

		int[] NumbArr = {23,45,67,32,89,22 };
		
//		int ArrLen = 0;
		int i = 1;
		
		Arrays.sort(NumbArr);
//		ArrLen = NumbArr.length;	
		
		//print the seconod smallest number in the array
		System.out.println("The Second Smallest element in the array is");
		System.out.println( NumbArr[i]);
		
	}

}
