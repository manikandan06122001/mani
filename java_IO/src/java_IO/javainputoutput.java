package java_IO;
import java.io.File;
import java.util.Scanner;

public class javainputoutput {

	public static void main(String[] args) {
		System.out.println("ENTER THE PATH WHERE YOU WANT TO CREAT A FOLDER");
		Scanner sc=new Scanner(System.in);
		String path=sc.nextLine();
		System.out.println("ENTER THE NAME OF DESIRED A DIRECTORY");
		path = path+sc.next();
		File obj=new File(path);
		boolean present =obj.mkdirs();
		if(present) {
			System.out.println("FOLDER IS CREATED SUCCESSFULLY");
		}else {
			System.out.println("ERROR FOUND");
		}
			
	}

}
