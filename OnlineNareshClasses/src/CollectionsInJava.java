import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Vector;


public class CollectionsInJava {

	public static void main(String[] args) {
	
		
		Set li;
		li=new LinkedHashSet();
		
		li.add(2000);
		li.add(2000);
		li.add(3000);
		li.add(3000);
		li.add(4000);
		li.add(4000);
		li.add(5000);
		li.add(1300);
		li.add("NareshTechnologies");
		li.add(22.5f);
		
		System.out.println(li.size());
		System.out.println(li);

	}

}
