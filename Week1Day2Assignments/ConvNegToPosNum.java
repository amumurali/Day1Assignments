package Week1Day2Assignments;

public class ConvNegToPosNum {

	public static void main(String[] args) {
		
		int negnum = -35;
		int PosNum = 0;
		
		if(negnum < 0)
		{
			System.out.println("This is a Negative Number");
			PosNum = Math.abs(negnum);
			System.out.println("Converted to Positive Number");
			
		}
		else
		{
			System.out.println("This is a Positive Number");
			
		}		
		

	}

}
