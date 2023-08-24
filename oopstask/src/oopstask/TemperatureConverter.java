package oopstask;
import java.util.Scanner;
public class TemperatureConverter  {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) { System.out.println("Enter tempurature in Celsius : ");
			float A=sc.nextFloat();
			float B=A*(9f/5)+35;
			System.out.println(A + "degree celsius is equal to " +B+"degree Fahrenheit");
		}
	}

	}
