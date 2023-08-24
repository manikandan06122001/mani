package lambda;

public class Instatncemethod1 extends Thread{
	
	void Say() {
		System.out.println("THIS IS INSTATNCE METHOD");
	}

	public static void main(String[] args) {
		Thread T=new Thread(new Instatncemethod1()::Say);
		T.start();

	}

}
