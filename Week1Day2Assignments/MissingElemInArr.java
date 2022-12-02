package Week1Day2Assignments;

import java.util.Arrays;

public class MissingElemInArr {

	public static void main(String[] args) {

		int[] NumbArr = {1,2,3,4,7,6,8};
		int ArrLen = 0;
		int i = 0;
		
		Arrays.sort(NumbArr);
		
		ArrLen = NumbArr.length;
		
		
		for(i = 0; i < ArrLen; i++)
		{
			if((i+1) != NumbArr[i])
			{
				System.out.println("Missing Element in the array is ");
				System.out.println(i+1);
				break;
				
			}
				
		}
		
		
	}

}
