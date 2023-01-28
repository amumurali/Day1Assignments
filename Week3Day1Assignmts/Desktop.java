package Week3Day1Assignmts;

public class Desktop extends Computer {
	
	void desktopSize()
	{
		System.out.println("Desktop Size");
		
	}

	//Single Inheritance
	public static void main(String[] args) 
	{

		Desktop obj = new Desktop();
		obj.ComputerModel();
		obj.desktopSize();
	
	}

}
