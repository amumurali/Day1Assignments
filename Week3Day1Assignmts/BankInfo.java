package Week3Day1Assignmts;

public class BankInfo {

	
	public void savings()
	{
		System.out.println("Parent Class Savings account");
	}
	
	public void fixed()
	{
		System.out.println("Parent Class fixed account");
		
	}
	public void deposit()
	{
		System.out.println("Parent Class deposit account");
	}
	
	
	//Method Overriding example
	public static void main(String[] args) {

		AxisBank ABAcc = new AxisBank();
		ABAcc.deposit();//runtime polymorphism
		
	}

}
