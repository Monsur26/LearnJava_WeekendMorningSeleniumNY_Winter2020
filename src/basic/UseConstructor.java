package basic;

public class UseConstructor {
	
	// Name will be same as class name
	// no return type.
	// used to initialize the object
	// before creating parameterized constructor must create Default constructor. 
	
	// 1.Default or non-parameterized, 2. parameterized. 
	// AccessModifier className();
	
	String name;
	String address;
	int mobile;
	double courseFee=5000.50;
	public UseConstructor() {
	
	// Default constructor- no parameter	
	// ClassName()=Constructor.	
		
		System.out.println("Learn Constructor");
	}
	
	public UseConstructor(String newName) {// single parameterized
	// parameter signature	
		this.name=newName; //this indicating all the properties of this class.
		System.out.println("Name is: " +this.name);
	}
	
	public UseConstructor(String address, String name, int mobile) {
		this.name= name;
		this.address= address;
		this.mobile= mobile;
		
		System.out.println("Name is :" +this.name+" Address is :" +this.address+" mobile no is:"+this.mobile);
		
	}
	public UseConstructor(String newAddress, String newName) {
		this.name= newName;
		this.address= newAddress;
		
		System.out.println("Name is :" +this.name+" Address is :" +this.address);
		
	}
	
	
	
	public static void main(String[] args) {
		
		UseConstructor learn=new UseConstructor();
		
		UseConstructor monsur=new UseConstructor("Monsur Ahmed");// argument pass inside of the constructor
		UseConstructor Hassan= new UseConstructor("Queens","Hassan");
		UseConstructor Xavi= new UseConstructor("Queens", "Xavi", 9087086);
		
	}

}
