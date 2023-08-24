package java_IO;
import java.io.FileOutputStream;
public class javawrite {
	public static void main(String[] args) {
		try {
		FileOutputStream s=new FileOutputStream("D:\\javafile\\java\\hello.txt");
		String m="\t HELLO JAVA ";
		byte n[]=m.getBytes();
		s.write(n);
		s.close();
		System.out.println("File successfully created");
		}catch (Exception e) {
			System.out.println(e);
		}
		
		
	}

}
