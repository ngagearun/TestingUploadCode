
 class AccessModifiers {

	  int a=100;
	  void m2(){
		 
	 }
}
 
class C1 extends AccessModifiers{
	
	void m1(){
		System.out.println(a);
		m2();
	}
}
