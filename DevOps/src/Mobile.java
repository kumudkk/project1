
public class Mobile {
	public String message;
	public void dialing(String number) {
		
	System.out.println("Dialing the number:"+ number);	
	}
	
	public static  String sendMessage(String message) {
		
	return message;
	}

	public void receiveMessage(String s) {
		
		String s1 = sendMessage(s);
		System.out.println("Sending Message:"+s);
		System.out.println("Received message is --->"+" " +s1);
	}


	public static void main(String[] args) {
	Mobile mb = new Mobile();
	mb.dialing("732-334-5728");
	String s = mb.sendMessage("How are you?");
	mb.receiveMessage(s);

	}

}
