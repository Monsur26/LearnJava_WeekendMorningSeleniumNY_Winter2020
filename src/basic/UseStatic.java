package basic;

public class UseStatic {
	
	//Global variable
	//static type global variable
	static int age=24;
	//non-static type global variable
	String name="Jimy";
	
	
	public static void main(String[] args) {
		
		//classname.variabe (for static by class name) 
		UseStatic.age=24;//re initialize/ reasssign value
		
		System.out.println("My Age is "+UseStatic.age);
		
		//need to create object for nonstatic variables
		//object:
		
		
		
		//classname objectName=new ConstractorOf(class)
		Computer com=new Computer();
		com.computerBrandName = "HP";
		
		System.out.println("Computer brand name is " +com.computerBrandName);
		

		
	}
	
	
	
	
	
	
	
	

}
