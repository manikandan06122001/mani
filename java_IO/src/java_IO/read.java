package java_IO;
import java.io.FileInputStream;
public class read {

	public static void main(String[] args) {
		try {
			FileInputStream ss=new FileInputStream("D:\\javaIO\\javainputoutput\\mani\\success.txt");
			int i=0;
		while((i=ss.read())!=-1) {
			System.out.print((char)i);
		}
		ss.close();
		}catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("\n\tSuccessfully text filet read");
	}

}
