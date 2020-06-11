public class Methodoverload1 {

static String form;

static String  input (String Name,int Age,String Addr) {

form=Name+","+Age+","+Addr;

return form;
}

static String  input (String Name,int Age,String Addr,String Gender) {

form=(Name+","+Age+","+Addr+","+Gender);

return(form);
}

static String  input (String Name,int Age,String Addr,String Gender,int Ph) {

form=(Name+","+Age+","+Addr+","+Gender+","+Ph);

return(form);
}

static String  input (String Name,int Age,String Addr,String Gender,int Ph,int Pin) {

form=(Name+","+Age+","+Addr+","+Gender+","+Ph+","+Pin);

return(form);
}


public static void main(String[] args)
{
//Methodoverload1 abc=new Methodoverload1();
System.out.println(input("Naresh", 21, "111 bunker hill"));
System.out.println(input("Naresh", 21, "222 anker hill"));
System.out.println(input("Naresh", 23, "111 bunker hill", "M"));
System.out.println(input("Naresh", 24, "111 bunker hill", "M", 2039094292));
System.out.println(input("Naresh", 25, "111 bunker hill", "M", 2039094292, 43220));

}

}
