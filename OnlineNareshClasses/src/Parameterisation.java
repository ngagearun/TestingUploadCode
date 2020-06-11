import java.util.Scanner;


public class Parameterisation {
	
	int add;
	
	void sum(int num1,int num2){
		add=num1+num2;
		//return add;
		System.out.println(add);
		System.out.println();
	}

	public static void main(String[] args) {
		
		Parameterisation obj=new Parameterisation();
		obj.sum(100,200);
		obj.sum(200,200);
	
		
		
		
		Scanner sc=new Scanner(System.in);
		int name=sc.nextInt();
		System.out.println(name);

	}

}
