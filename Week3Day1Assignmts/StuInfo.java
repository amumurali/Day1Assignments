package Week3Day1Assignmts;

public class StuInfo {
	
	public void getStudentsInfo(int id)
	{
		System.out.println("Student Id");
	}

	public void getStudentsInfo(int id, String name)
	{
		System.out.println("Student Id and Name");
	}
	

	public void getStudentsInfo(String email, long phoneno)
	{
		System.out.println("Student eMail and Phone Number");
	}
	//Overloading concept
	public static void main(String[] args) {
		
		int sId = 01;
		String sName = "Amudha";
		String eMail = "xxx@gmail.com";
		long phNo = 1234567891;
		
		StuInfo obj = new StuInfo();
		obj.getStudentsInfo(sId);
		obj.getStudentsInfo(sId,sName);
		obj.getStudentsInfo(eMail,phNo);
	}

}
