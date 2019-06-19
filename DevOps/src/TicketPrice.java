
public class TicketPrice {
	int ticketPrice;
	
	public int calculateTicketPrice(int num) {
		
		if(num < 11) {
			ticketPrice = num *400;
			
		}else {
			ticketPrice = (int) (num*0.9*400);
		}
		return ticketPrice;
	}

	public static void main(String[] args) {
		TicketPrice tp =  new TicketPrice();
		System.out.println(tp.calculateTicketPrice(100));

	}

}
