package Advance;

import doEnum.Color;

public class Test {
	
	public static void main(String[] args) {
		
		//Color.RED="Red";
		System.out.println(Color.RED);
		for (Color col : Color.values()) {
			
			System.out.println(col);
			
			System.out.println(Level.HIGH);
		}
		
		
	}
	
	public static enum Level{
		LOW,HIGH,MEDIUM
		
	}
	

}
