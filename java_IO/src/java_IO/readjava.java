package java_IO;
import java.io.*;
public class readjava {
public static void main(String[]  args)throws Exception {
	/*FileOutputStream fout=new FileOutputStream("D:\\manid.txt");
	BufferedOutputStream bout=new BufferedOutputStream(fout);
	String s="welcome to mani house";
	byte k[]=s.getBytes();
	bout.write(k);
	bout.flush();
	bout.close();
	fout.close();
	System.out.println("success");*/
	try{
		FileInputStream fout=new FileInputStream("D:\\manid.txt");
	BufferedInputStream bout=new BufferedInputStream(fout);
	int i;
	while((i=bout.read())!=-1) {
	System.out.print((char)i);
	}
	}catch (Exception e) {
		System.out.println(e);
	}
}
}
