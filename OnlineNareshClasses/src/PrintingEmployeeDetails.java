class Person{
	
	String firstname,lastname;
	
	Person(String firstname,String lastname){
		this.firstname=firstname;
		this.lastname=lastname;
	}
	void showpersonaldetais(){
		System.out.println("The Firstname is"+firstname);
		System.out.println("The lastname is"+lastname);
	}
}

class PersonEmployeedeails extends Person{
	
	String departmentname;
	int salary,tax;
	
	PersonEmployeedeails(String firstname,String lastname,String departmentname,int salary,int tax){
	
		super(firstname,lastname);
		this.departmentname=departmentname;
		this.salary=salary;
		this.tax=tax;
	}
	
	void showpersonaldetais(){
		System.out.println("The Firstname is"+firstname);
		System.out.println("The lastname is"+lastname);
	}
	
	void showEmployeepersondetails(){
		this.showpersonaldetais();
		System.out.println("The department name is"+departmentname);
		System.out.println("The salary is"+salary);
		System.out.println("The tax is"+tax);
	}	
}

class PrintingEmployeeDetails {

	public static void main(String[] args) {
		
		PersonEmployeedeails person1=new PersonEmployeedeails("Narsimha", "Kumar", "SDET", 200000, 2000);
		person1.showEmployeepersondetails();

	}

}
