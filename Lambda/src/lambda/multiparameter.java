package lambda;
@FunctionalInterface
interface showable{
	int show(int a ,int b);
}

public class multiparameter {

	public static void main(String[] args) {
		showable md=(a,b)->(a+b);
		System.out.println(md.show(06, 24));
		
        showable dm=(int a,int b)->{
        	return (a+b);
        };
        System.out.println(dm.show(100,200));
}
}
