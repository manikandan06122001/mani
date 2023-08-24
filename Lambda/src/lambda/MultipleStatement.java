package lambda;
@FunctionalInterface
interface drawable{
	String draw(String message);
}
public class MultipleStatement {

	public static void main(String[] args) {
		drawable md=(message)->{
			String s1="Hello";
			String s2=s1+message;
			return s2;
		};
		System.out.println(md.draw("\nMANIKANDAN"));

	}

}
