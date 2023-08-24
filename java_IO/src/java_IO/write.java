package java_IO;
import java.io.FileOutputStream;
public class write {

	public static void main(String[] args) {
		try {
			FileOutputStream fout=new FileOutputStream ("D:\\javaIO\\javainputoutput\\mani\\success.txt");
			String s="Sucess full created in text file";
			byte b[]=s.getBytes();
			fout.write(b);
			fout.close();
			System.out.println("Sucess full created...");
			}catch(Exception e) {
				System.out.println(e);
			}

	}

}
