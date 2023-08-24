package lambda;

public class Staticthread extends Thread{
public static void ThreadStatus() {
	try {
		Thread.currentThread();
		System.out.println(Thread.currentThread());
		Thread.sleep(2000);
		
	}catch (Exception e){
		System.out.println(e);
	}
	System.out.println("Thread is starting");
}
	public static void main(String[] args) {
		Thread md=new Thread(Staticthread::ThreadStatus);
       md.start();
	}

}
