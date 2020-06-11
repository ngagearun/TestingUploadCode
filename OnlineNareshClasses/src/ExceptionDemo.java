import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class ExceptionDemo {
	
	void division(){
		try{
			FileInputStream fi=new FileInputStream("C:\\Temp.xlsx");
			//loic code
			
			
		int div=100/0;
		System.out.println(div);
		}catch(ArithmeticException |  FileNotFoundException e ){
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		finally{
			fi.close();
		}
		
	}
	
	
	void show() throws InterruptedException, FileNotFoundException, UserDefinedException{
		int age=14;
		if(age>18){
			System.out.println("Eligible for voting");
		}else{
			throw new UserDefinedException("Not eligible for voting");
		}
		
	}

	public static void main(String[] args) throws FileNotFoundException, InterruptedException, UserDefinedException {
		
		ExceptionDemo ex=new ExceptionDemo();
		//ex.division();
		
		ex.show();

	}

}
