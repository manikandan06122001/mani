package java_IO;
import java.io.File;

public class filecreat {

	public static void main(String[] args) {
		File A=new File("D:\\javaIO\\javainputoutput\\mani");
		boolean present=A.exists();
		if(present==false) {
			A.mkdir();
		}
		System.out.println("\tFile creat successfully");
	}

}
