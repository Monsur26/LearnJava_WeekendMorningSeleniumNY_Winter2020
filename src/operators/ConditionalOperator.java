package operators;

public class ConditionalOperator {
	
	// && conditional AND:all conditions have to be true
	// || conditional OR: if one condition is true the block of code will be executed
	
	public static void main(String[] args) {
		
		int number1=75;
		int number2=65;
		
		if(number1==55 && number2==65) {
			
			System.out.println("number1 is 55 and number2 is 65");
		}
		
if(number1==55 || number2==65) {
			
			System.out.println("number1 is 55 and number2 is 65");
		}
		
	}

}
