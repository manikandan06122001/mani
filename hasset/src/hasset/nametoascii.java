package hasset;

public class nametoascii {

	public static void main(String[] args) {
		char[] name = {'M','A','N','I','K','A','N','D','A','N'};
		for(char c:name) {
			int asciiValue=(int)c;
			System.out.println("Name : "+c+",ASCII value : "+asciiValue);
		}

	}

}
