package Week3Day1Assignmts;


//Abstraction concept
	public class AbsAutomation extends MultipleLanguage implements Language, Testtool {
		
		   
		   public static void main(String[] args) {

			   AbsAutomation obj = new AbsAutomation();
				obj.Java();
				obj.Selenium();
				obj.python();
				obj.ruby();
			}	

		public void Java()
		{
			System.out.println("Java Language");
		}
		public void Selenium()
		{
			System.out.println("Selenium tool");
		}

		
		public void ruby()
		{
			System.out.println("Ruby");
		}
		
		
		
	}


	
