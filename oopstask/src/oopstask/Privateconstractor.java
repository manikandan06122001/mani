package oopstask;
class Privateconstractor  {
	
	static Privateconstractor instence= null;
	public int X=10;
	
	private Privateconstractor() { }
		static public Privateconstractor getinstence() {
			if(instence ==null)
				instence=new Privateconstractor();
			return instence;
		}
	
	public static void main(String[] args) {
		
	 
		Privateconstractor a=Privateconstractor.getinstence();
		Privateconstractor b=Privateconstractor.getinstence();
		a.X=a.X+10;
		System.out.println("value 1 :"+a.X);
		System.out.println("value 2 :"+b.X);
		

	}

}
