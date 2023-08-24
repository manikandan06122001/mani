package lambda;
@FunctionalInterface
interface Sayable{
	public String say(String name);
}
public class SingleParameter {

	public static void main(String[] args) {
		Sayable m=(name)->{
			return "HELLO..."+name;
		};
System.out.println(m.say("\nMANIKANDAN"));
	}

}
