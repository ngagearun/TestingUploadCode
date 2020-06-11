
//2015
abstract class Person1{
	
	void call(){
		System.out.println("calling");
	}
	abstract void dancing();
	abstract void cooking();
	abstract void playmusic();
	
}

//2017

abstract class Person2 extends Person1{
	

	@Override
	void call(){
		System.out.println("Calling feature");
	}

	@Override
	void dancing(){
	   System.out.println("Dancing");
    }
	abstract void cooking();
	abstract void playmusic();
	
}

//2020
class person3 extends Person2{

	@Override
	void cooking() {
		
		System.out.println("Cooking");
		
	}

	@Override
	void playmusic() {
		
		System.out.println("Playing musci");
		
	}
	
}