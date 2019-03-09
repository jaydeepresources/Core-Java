package sync;

public class TestTickets {

	public static void main(String[] args) {
		
		TicketBooking[] tickets = new TicketBooking[12];
		
		for (int i = 0; i < tickets.length; i++) {
			tickets[i] = new TicketBooking();
		}
		
		for (int i = 0; i < tickets.length; i++) {
			tickets[i].start();
		}

	}

}
