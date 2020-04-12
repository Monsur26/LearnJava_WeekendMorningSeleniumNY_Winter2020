package basic;

public class UseObject {
	
	
	
	
	public static void main(String[] args) {
		
		Computer MyComputer = new Computer();
		
		MyComputer.display();//call method by object name
		

		MyComputer.computerBrandName="HP";//call variable by object name and Re-initialize
		
		double newprice=MyComputer.computerPrice=2600.900;
		
		System.out.println(MyComputer.computerBrandName);
		
		System.out.println( "Computer Price: " +newprice);
		
		UseStatic.age=57;
		System.out.println(UseStatic.age);
		
		
		
		Computer yourComputer = new Computer();
		String BrandName=yourComputer.computerBrandName="tubi";
		System.out.println(BrandName);
		
		
		
	}

}
