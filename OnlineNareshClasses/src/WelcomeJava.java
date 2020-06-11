

 class WelcomeJava {
	 //instance variables
	 int stdrollno=1001,area;
	 //static variable
	 static int accno=2000;
	 WelcomeJava welcome;
	 //instance method
	 void square(){
		
		 String name;
		 System.out.println(accno);
		 
	 }
	 //static method
	  static void circle(){		
		 System.out.println(accno);
	 }

	 
	 
	 public static void main(String[] args){
		
		 int a=100;
		 String name="arun";
		 System.out.println(a);
		 System.out.println(name);
		 WelcomeJava welcome=new WelcomeJava();
		 welcome.square();
		 WelcomeJava.circle();
		 System.out.println(accno);
		 
	 }	 
	 
	 
	 
}
