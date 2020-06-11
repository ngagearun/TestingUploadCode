
 class Employer {
	
	String companyname="HCL";
	 String employeename;
	  String emailid;
	  
	  void displaydetails(){
		  
		System.out.println(companyname);  
	  }
	  
	  

}


 class Employee1 extends Employer{
	 
	 void inputdetails(){
		 employeename="arun";
		 emailid="arun@hcl.com";
		 displaydetails();
		 
		 System.out.println(employeename);
		 System.out.println(emailid);
	 }
	 
 }