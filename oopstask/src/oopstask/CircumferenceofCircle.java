package oopstask;
import java.util.Scanner;
public class CircumferenceofCircle {

	public static void main(String[] args) {
		/*int radius=3;
		double area=Math.PI*(radius*radius);
		System.out.println("Area is : " +area);
		
		double Circumfrance=Math.PI*2*radius;
		System.out.println("Cirumference is : " +Circumfrance);*/
         
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the radius");
			int radius=sc.nextInt();
			 double area=Math.PI*(radius*radius);
			 System.out.println("Area is : " +area);
			 double Circumfrance=Math.PI*2*radius;
			 System.out.println("Cirumference is : " +Circumfrance); /* .... */
		}
	}

}
