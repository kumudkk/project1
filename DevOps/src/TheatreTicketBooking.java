
public class TheatreTicketBooking {
	int totalPrice;
	
	public int buyTicket(int num1, int num2) {
		
		int silverTicketPrice = num1*150;
		int goldTicketPrice = num2*200;
		return goldTicketPrice + silverTicketPrice;
		 
	}

	public static void main(String[] args) {
		TheatreTicketBooking Tb = new TheatreTicketBooking();
		System.out.print("Total cost of the ticket ---->"+Tb.buyTicket(5, 5));

	}

}
