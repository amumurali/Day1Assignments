package Week1Day2Assignments;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int fNumRange = 8;
		int firstNum = 0;
		int secNum = 1;
		int sum = 0;
		
		System.out.println("The Fibinocci Series of the given Input Range ");
		
		//Print the first no
		System.out.println(firstNum);
		System.out.println(secNum);
		
		
		for(int i=1;i<fNumRange;i++)
		{
				sum = firstNum + secNum;
				firstNum = secNum;
				secNum = sum;			
				System.out.println(sum);
				
		}
		

	}

}
