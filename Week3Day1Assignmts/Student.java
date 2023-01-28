package Week3Day1Assignmts;

public class Student extends Department 
{
	

	public void StudentName()
	{
		System.out.println("Student Name");
	}
	
	public void StudentDept()
	{
		System.out.println("Department Name");
	}
	
	public void StudentId() 
	{
		System.out.println("Student Id");
	}
	//Multilevel inheritance concept
	public static void main(String[] args) {

		Student obj = new Student();
		obj.StudentName();
		obj.StudentDept();
		obj.StudentId();
		
		obj.collegecode();
		obj.collegename();
		obj.collegerank();
		
		
	}

}
