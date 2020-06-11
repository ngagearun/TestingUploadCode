
public class ThisKeyWord {
	
	int a,b;
	
	void input(int a,int b){
		
		this.a=a;
		this.b=b;
	}
	
	ThisKeyWord(){
		System.out.println("I am in constructor");
	}
	
	void display(){
		System.out.println(a);
		System.out.println(b);
		
	}
	
	public static void main(String[] args) {
		
		ThisKeyWord t1=new ThisKeyWord();
		t1.input(10, 20);
		t1.display();

	}

}
