package lambda;
@FunctionalInterface
interface display{
	String displays();
}
public class noparameter {

	public static void main(String[] args) {
		display d=()->{
			return "I have nothing to say.";
		};
		System.out.println(d.displays());

	}

}
