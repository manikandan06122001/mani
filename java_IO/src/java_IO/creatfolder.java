package java_IO;
import java.io.File;
public class creatfolder {

	public static void main(String[] args) {
	File ss=new File("D:\\javafile\\java");
	boolean present=ss.exists();
	if(present==false) {
		ss.mkdir();
	}System.out.println("Success fully created");
	}

}
