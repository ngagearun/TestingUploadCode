
public class StaticConcept {
	
	int rollno;
	String name;
	static String collegename="arora";

	public static void main(String[] args) {
		
		
		StaticConcept std1=new StaticConcept();
		std1.rollno=1001;
		std1.name="naresh";
	
		
		
		StaticConcept std2=new StaticConcept();
		
		std2.rollno=1001;
		std2.name="naresh";
		
		System.out.println("The roll no fr student is"+std1.rollno+"The name of the std is"+std1.name+"The collegename is"+collegename);
		System.out.println("The roll no fr student2 is"+std2.rollno+"The name of the std2 is"+std2.name+"The collegename is"+collegename);

	}

}
