package java_IO;
import java.io.*;
public class sequence {

	public static void main(String[] args) throws Exception {
		FileInputStream fin1=new FileInputStream("D:\\manid.txt");
		FileInputStream fin2=new FileInputStream("D:\\javafile\\java\\hello.txt");
		FileOutputStream fin3=new FileOutputStream("D:\\d\\hi.txt");
		SequenceInputStream sis=new SequenceInputStream(fin1,fin2);
		int i;
		while((i=sis.read())!=-1)
		{
        fin3.write(i);
	    }
      sis.close();
      fin3.close();
      fin1.close();
      fin2.close();
      System.out.println("Successfully Run");
}
}
