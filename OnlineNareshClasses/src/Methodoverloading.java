
  class Methodoverloading {
	
	int mul;
	
	int multiplication(int num1,int num2){
		mul=num1*num2;
		return mul;
		
	}
	
	
	int multiplication(int num1,int num2,int num3){
		
		mul=num1*num2*num3;
		return mul;
		
	}
	
	
	int multiplication(float num1,float num2){
		
		mul=(int) (num1*num2);
		return mul;
		
	}
	
	static void main(int a){
		
	}
	
  static void main(int a,int b){
		
	}

	public static void main(String[] args) {
		
		Methodoverloading methodoverloading=new Methodoverloading();
	System.out.println(methodoverloading.multiplication(23.5f, 41.5f));
	main(10);

	}

}
