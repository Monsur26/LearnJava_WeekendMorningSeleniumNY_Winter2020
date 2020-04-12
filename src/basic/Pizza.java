package basic;

public class Pizza {
	
	String type;
	int size;
	
	public Pizza() {
		System.out.println("Best Pizza");
		
	}
	
	public Pizza(String type) {
		this.type=type;
		System.out.println("Pizza type is: " +this.type );
	}
	
	public Pizza(String type, int size) {
		
		this.size=size;
		this.type=type;
		System.out.println("Pizza type is: "+this.type+" Pizza size is: " +this.size);
		
	}
	public static void main(String[] args) {
		Pizza domions=new Pizza();
		Pizza dominosName=new Pizza("Medium");
		Pizza domionsNameAndsize= new Pizza("Medium", 12);
	}
	
}
