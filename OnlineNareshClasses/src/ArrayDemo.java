
public class ArrayDemo {

	public static void main(String[] args) {
		
	

		/*int std_rollno[]=new int[5];
		
		std_rollno[0]=1001;
		std_rollno[1]=1002;
		std_rollno[2]=1003;
		std_rollno[3]=1004;
		std_rollno[4]=1005;
		
		for(int i=0;i<=4;i++){
			
			System.out.println(std_rollno[i]);
		}		
		
		String coutryname[]={"India","Uk"};
		
		String name="arunkumar";
		char[] ch=name.toCharArray();
		*/
		
		
		//int stddetatils[][]=new int[3][3];
		
		int stddetatils[][]= {{ 1,2,3},
					          {4,5,6,8}, 
					          {7,8,9}
					 };
		
		
		
		
		for(int row=0;row<stddetatils.length;row++){
			
			for(int col=0;col<stddetatils[row].length;col++){
				
				System.out.println(stddetatils[row][col]);
			}
		}
		
		
		
	}

}
