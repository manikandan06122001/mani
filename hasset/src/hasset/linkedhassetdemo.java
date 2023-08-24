package hasset;
import java.util.LinkedHashSet;
import java.util.ArrayList;
import java.util.*;
public class linkedhassetdemo {

	public static void main(String[] args) {
		        ArrayList<Integer> evenNumbers = new ArrayList<>();
		        evenNumbers.add(2);
		        evenNumbers.add(4);
		        evenNumbers.add(19);
		        evenNumbers.add(-1);
		        evenNumbers.add(1);
		        evenNumbers.add(null);
		        evenNumbers.add(null);
//ArrayList instraction order maintained	duplicate value accepted	        
		       System.out.println("ArrayList: " + evenNumbers);
//LinkedList maintained at instraction order but duplicate value no accepted 
		        LinkedHashSet<Integer> numbers = new LinkedHashSet<>(evenNumbers);
		        System.out.println("LinkedHashSet: " + numbers);
	// hasset maintained priority value ,duplicate value not allow,order mainained in priority value	        
		        HashSet<Integer> number = new HashSet<>(evenNumbers);
		        System.out.println("HashSet "+ number);
// treeset
		        TreeSet<Integer>tree=new TreeSet<>();
		        tree.add(100);
		        tree.add(55);
		        tree.add(200);
		        tree.add(78);
		        Iterator sc=tree.iterator();
		        System.out.println("iterator is working");
		        while(sc.hasNext()) {
		        	System.out.println(sc.next());
		        }
		        System.out.println("desendingiteroter is working");
		        Iterator ss=tree.descendingIterator();
		        while(ss.hasNext()) {
		        	System.out.println(ss.next());
		        }
	}

}
