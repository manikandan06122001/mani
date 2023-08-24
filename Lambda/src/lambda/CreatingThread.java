package lambda;

public class CreatingThread {

	public static void main(String[] args) {
		//without lambda
		Runnable md=new Runnable() {
			public void run() {
				System.out.println("Thread is Running");
			}
		};
		Thread t=new Thread(md);
		t.start();
		//with lambda
		Runnable r=()->{
			try{
				Thread.sleep(2000);
			}catch(Exception e) {
				System.out.println(e);
			}
			System.out.println("Thraed 2 is Running");
			System.out.println("HELLO");
		};
    Thread t1=new Thread(r);
    t1.start();
	}

}
