package lambda;
@FunctionalInterface
interface Saya{
	void Say();
}
public class StaticMethod {
public static void SaySomthing() {
	System.out.println(" ...THIS IS STATIC METHOD...");
}
	public static void main(String[] args) {
		Saya md=StaticMethod::SaySomthing;
		md.Say();

	}

}
