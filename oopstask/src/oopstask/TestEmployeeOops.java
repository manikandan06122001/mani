package oopstask;
import java.util.Scanner;
public class TestEmployeeOops {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner (System.in)) {
			System.out.println("Enter the EmployeeName");
			String name=sc.nextLine();
			System.out.println("Enter the id ");
			int id=sc.nextInt();
			System.out.println("Enter the Salary");
			float salary=sc.nextFloat();
			
			EmployeeOops demo=new EmployeeOops(name,id,salary);
			System.out.println(demo);
			
			demo.setName("kumar");
			System.out.println("Name is:"+demo.getName());
			System.out.println("your id is :" +demo.getId());
			System.out.println("your salary is :" +demo.getSalary());
		}
	}

	

	
	}


