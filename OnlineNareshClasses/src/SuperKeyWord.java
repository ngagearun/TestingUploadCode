
class Parent{
	
	String companyname="HCL";
	 String employeename;
	  String emailid;
	  
	  
	   void displaydetails(){
		  
		System.out.println("I am in parent class");  
	  }
	  

	  
	
}

class Child extends Parent{
	
	@Override
	 void displaydetails(){
		
		System.out.println("I am in child class");
		
	}	
	
	void show(){
		displaydetails();
		m1();
	}
	
}

public class SuperKeyWord {
	
	
	public static void main(String[] args){
		
		Parent p1=new Parent();
		p1.displaydetails();
		
	}

}
