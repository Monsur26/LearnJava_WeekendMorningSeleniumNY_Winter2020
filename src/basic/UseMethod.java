package basic;

public class UseMethod {
	
	//Method name:verb+Noun (camelCase)
	// Method syntax: 
	// AccessModifier Returntype/Method type MethodName(){method body}
	
	// Return type: All Data type, void class and object
	
	

	public static void display() {// Method body start point
				//display is method name
		System.out.println("Display is good");
	}// method body end point
	
	public void tvDisplay() {
	System.out.println("Tv display is good");
	}
	//non Return type without parameter //(void means non return type)
	public void doSummation() {
	int number1=50;
	int number2=60;
	int summation=number1+number2;
	System.out.println("Summation of two numbers: "+summation);
	
		}
	// non return type with parameter:Dynamic method
	public void doSubstraction(int number1, int number2) {
		int substraction=number1-number2;
		System.out.println("Substraction value is: "+substraction);
	}
	public void doSubstraction(int number1, int number2,int number3) {
		int substraction=number1-number2-number3;
		System.out.println("Substraction value is: "+substraction);
	}
	
	
	//Return method without parameter
	public int  doMultiply() {
		int number1=20;
		int number2=3;
		int multiply=number1*number2;
		
		System.out.println("Multiplay value: "+multiply);
	return multiply;
	}
	
	//Return method without parameter
		public int  doMultiply(int number1,int number2) {
			int num1=number2;
			int num2=number2;
			int multiply=num1*num2;
			
			System.out.println("Multiplay value: "+multiply);
		return multiply;
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		UseMethod.display();//call method by class name because of static key word
		
		UseMethod obj=new UseMethod();
		obj.tvDisplay();//call by object name
		
		obj.doSummation();
		obj.doSubstraction(200, 80);
		obj.doSubstraction(560, 230);
		obj.doSubstraction(20, 2, 13);
		obj.doMultiply();
		obj.doMultiply(40, 32);
	
	}
	
	
}
