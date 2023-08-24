package java_IO;

public class join extends Thread {
 public void run() {
	 for(int i=1;i<=2;i++)
	 {
		 try {
			 Thread.sleep(300);
			 System.out.println("Current Thread"+Thread.currentThread().getName());
		 }
		 catch (Exception ex)
		 {
			 System.out.println("EXCEPTION CAUGHT"+ex);
		 }
		 System.out.println(i);
	 }
 }
	public static void main(String[] args) 
	{
join t1 =new join();
join t2=new join();
join t3=new join();

   t1.start();
   try {
	   System.out.println("CURRENT THREAD : "+Thread.currentThread().getName());
	   t1.join();
   }catch(Exception ex)
   {
	   System.out.println("Exception caught :"+ex);
   }
   t2.start();
   try {
	   System.out.println("CURRENT Thread : "+Thread.currentThread());
	   t2.join();
   }catch(Exception ex)
   {
	   System.out.println("Exception caught"+ex);
   }
   t3.start();
	}
 
  
}
