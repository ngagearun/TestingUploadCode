
 interface AbInterface {
	
	void m1();
	void m2();
	
}

 

 interface AbInterface1 {
	
	void m1();
	void m2();
	
}
 
 class C1 implements AbInterface,AbInterface1{

	@Override
	public void m1() {
		
		System.out.println("m1");
		
	}

	@Override
	public void m2() {
		
		System.out.println("m2");
		
	}
	 
 }

class C2 extends C1{
	
	
	@Override
	public void m1() {
		super.m1();
		System.out.println("m3");
		
	}

	@Override
	public void m2() {
		
		System.out.println("m4");
		
	}
	
}


class C3 extends C2{
	
	
	@Override
	public void m1() {
		super.m1();
		System.out.println("m3");
		
	}

	@Override
	public void m2() {
		
		System.out.println("m4");
		
	}
}