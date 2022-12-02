package Week1Day2Assignments;

public class PrimeNo 
{		
	public static void main(String[] args) 
	{
		
		int number = 15;
		int loop = number/2;
		Boolean flag = false;
		
		if(number==0 || number == 1)
		{
			System.out.println("Number is a not a Prime Number");
		}
		else	
		{
			for(int i = 2; i<=loop; i++)
			{
				if(number%i == 0)
				{
				
					System.out.println("Number is a not a Prime Number");	
					flag = true;
					break;
				}
				
			}
				
		}
		if(flag == false)
		{
				System.out.println("Number is a Prime Number");
				
		}
		
	}

}
