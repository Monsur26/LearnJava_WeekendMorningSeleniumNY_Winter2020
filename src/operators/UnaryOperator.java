package operators;

public class UnaryOperator {
	
	//Increment operator ++ add 1
	// preincrement ++num
	// post increment num++  for next time when called same variable.
	
	// Decrement operator -- Decrease -1.
	// predecrement --num
	// postdecrement num--
	
	
	
	public static void main(String[] args) {
		
		
		int number=5;
		//number++;
		System.out.println(number++);// holding value for future.
		System.out.println(number);
		
		
		 // 1+number means 1+6=7
		System.out.println(++number);
		
		number--;
		System.out.println(number);
		System.out.println(--number);
		
		number++;
		number++;
		number--;
		number--;
		--number;
		++number;
		System.out.println(number);
		
		

		
		
	}
	

}
