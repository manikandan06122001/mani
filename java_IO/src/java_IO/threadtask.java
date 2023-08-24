package java_IO;
import java.lang.*;
import java.util.Scanner;

public class threadtask extends Thread {
	public void run() {
		Scanner sc=new Scanner(System.in);
		try {
			Thread.sleep(500);
		System.out.println("ENTER YOUR NAME :");
	String name=sc.nextLine();
	Thread.currentThread().setName("MANIKANDAN.S");
		}catch(Exception e) {
			System.out.println(e);
		}
		try {
			Thread.sleep(1000);
	System.out.println("ENTER YOUR'S AGE :");
	int age=sc.nextInt();
		}catch(Exception e) {
			System.out.println(e);
		}
		try {
			Thread.sleep(1000);
			System.out.println("ENTER YOUR DEPARTMENT :");
	String department=sc.nextLine();
	sc.nextLine();
		}catch(Exception e) {
			System.out.println(e);
		}
		try {
			Thread.sleep(1000);
			System.out.println("ENTER YOUR SALARY :");
			float salary=sc.nextFloat();
		}catch(Exception e) {
			System.out.println("ENTER THE NUMBER DISNOT SUPPORT ALPHABETICAL /CHARECTER"+e);
		}
		try {
			Thread.sleep(1000);
			System.out.println("ENTER YOUR MOBILE NUMBER :");
			long MobileNo=sc.nextLong();
		}catch(Exception e) {
			System.out.println(e);
		}
		try {
			Thread.sleep(1000);
			System.out.println("ENTER YOUR ACCOUNT NUMBER :");
			long AccountNumber=sc.nextLong();
		}catch(Exception e) {
			System.out.println(e);
		}
		System.out.println(Thread.currentThread().getName());
		}
	public static void main(String[] args) {
		
		threadtask t1=new threadtask();
		
		
		t1.start();
	try {
		System.out.println("EMPLOYEE DETAILS");
	}catch(Exception e) {
		System.out.println(e);
	}
	}

}
