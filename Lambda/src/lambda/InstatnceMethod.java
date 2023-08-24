package lambda;
@FunctionalInterface
interface Says{
	void Say();
}

public class InstatnceMethod {
        public void SaySomthing() {
        	System.out.println("HELLO...,THIS IS NON-STATIC METHOD");
        }
	
	public static void main(String[] args) {
		InstatnceMethod md=new InstatnceMethod();
		Says dm=md::SaySomthing;
		dm.Say();
        Says dm1=new InstatnceMethod()::SaySomthing;
       dm1.Say();
	}

}
