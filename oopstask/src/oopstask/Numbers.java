package oopstask;
import java.util.Scanner;
public class Numbers {

	public static void main(String[] args) {
		System.out.println("CHECK NUMBER IS POSTIVE OR NEGATIVE");
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the Number :");
			int num=sc.nextInt();
			if(num>0) {
				System.out.println(num+"--> is Postive Number");
			}
			if(num<0) {
				System.out.println(num+"--> is Negative Number" );
			}
			
			System.out.println("CHECK NUMBER IS ODD OR EVEN ");
			if(num%2==0) {
				System.out.println(num + "--> is Even Number");
			}
			if(num%2!=0) {
				System.out.println(num + "--> is Odd Number");
			}
			System.out.println("Calculating the Square of the Number");
			int sqr=num*num;
			System.out.println("Squre value -->" + sqr);
		}
	}

}
