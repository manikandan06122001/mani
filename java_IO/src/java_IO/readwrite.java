package java_IO;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
public class readwrite 
{

	public static void main(String[] args) 
	{
	File creat=new File("D:\\d\\hi.txt");
			boolean check=creat.exists();
	try {
		creat.createNewFile();
		FileWriter writer=new FileWriter(creat);
		writer.write(65);
		writer.write(" how are you");
		writer.flush();
		writer.close();
		FileReader fileread=new FileReader(creat);
		int output=fileread.read();
		
		while(output!=-1)
		{
			System.out.print((char)output);
			output =fileread.read();
		}fileread.close();
		}catch (Exception e){
			System.out.print(e);
		}
	}
}

