package lambda;
interface Messageable{
	Message mMessage(String msg);
}
class Message{
	Message(String msg){
	System.out.println(msg);
	}
}
public class Constreactor {

	public static void main(String[] args) {
		Messageable md=Message::new;
		md.mMessage("Hello...");
		

	}

}
