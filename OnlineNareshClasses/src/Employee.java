
public class Employee {
	


void displayemployeedetails(String employeename,int employeeid){
	System.out.println(employeename+""+employeeid);
}
	int getSalary(int salary){
		
		return salary;
	}

}

class Permanent extends Employee{
	
	int bonus=10000;
	int getSalary(int salary){
		displayemployeedetails("arun",12345);
		salary=salary+bonus;
		return salary;
	}
	
}

class Contract extends Employee{
	
int getSalary(int salary){
		
		return salary;
	}
}
