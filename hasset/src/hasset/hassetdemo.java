package hasset;
import java.util.*;
public class hassetdemo {

	public static void main(String[] args) {
		ArrayList<String> color=new ArrayList<>();
		color.add("Red");
		color.add("Green");
		color.add("Orange");
		color.add("White");
		color.add("Black");
		System.out.println(color);
			System.out.println("After add element");
			color.add(0, "Pink");
			color.add(5, "Yellow");
			System.out.println(color);
			Object element =color.get(0);
			System.out.println("FIRST ELEMENT : "+element);
			element=color.get(2);
			System.out.println("Third element : "+element);
			System.out.println(color);
			boolean rr =color.contains("Red");
			if(rr) {
				System.out.println("Red is there");
			}else
			{
				System.out.println("not in there red");
				
			}
			Collections.sort(color);
			System.out.println(color);
			
		}
}
