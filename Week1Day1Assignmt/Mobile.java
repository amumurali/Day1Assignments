package Week1Day1Assignmt;

public class Mobile {
	
	void makeCalls()
	{
		String mobileModel = " Samsung ";
		float mobileWeight;
		System.out.println("I can  Call from my mobile");
	}
	
	void SendMsgs()
	{
		
		System.out.println("I can Send Messages too ");
	}


	public static void main(String[] args) {
		
		Mobile objMobile = new Mobile();
		System.out.println("This is my mobile");
		objMobile.makeCalls();
		objMobile.SendMsgs();
		
	}
}

	


