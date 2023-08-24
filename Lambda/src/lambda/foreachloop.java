package lambda;
import java.util.*;
public class foreachloop {

	public static void main(String[] args) {
		
Map<String,Integer>list=new HashMap<String,Integer>();
list.put("MANIKANDAN",9);
list.put("KARATHIK",6);
list.put("SILAMBARASON",4);
list.put("INBHASAGAR",8);

list.forEach(
		(m,k)->System.out.println(m)
		);
list.forEach(
		(m,k)->System.out.println(k)
		);
	}

}
