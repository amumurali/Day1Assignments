 package Week1Day2Assignments;

public class Palindrome {

	public static void main(String[] args) {
		
		int num = 34343;
		int rem = 0;
		int rev = 0;
		int pal = num;
		
		while(num > 0)
		{
			
			// Extract the last digit by getting the reminder
			rem = num % 10;
			
			// Move the previous reminder to a higher decimal place
			rev = (rev * 10) + rem;
			
			// Reduce the value by 1 decimal place
			num = num / 10;
			
		}
		if(pal == rev)
		{
			System.out.println("Number is a Palindrome");
		}
		else
		{
			System.out.println("Number is not a Palindrome");
			
		}

	}

}
