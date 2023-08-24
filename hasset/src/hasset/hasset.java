package hasset;
import java.util.*;
public class hasset {


	public static void main(String args[]) {  
			PriorityQueue<String> queue=new PriorityQueue<String>();  
			queue.add("Amit Sharma");  
			queue.add("Vijay Raj");  
			queue.add("JaiShankar");  
			queue.add("Raj");  
			System.out.println("GET PRIORITY : "+ queue.peek());
			Iterator<String> obj=queue.iterator();
					while(obj.hasNext()) {
			System.out.println(obj.next());
					}
			System.out.println(queue.poll());
				Deque<String> deque = new ArrayDeque<String>();  
				deque.add("Gautam");  
				deque.add("Karan");  
			    deque.add("Ajay");  
				for (String str : deque) {  
				System.out.println(str);  
				}  


	}

}
