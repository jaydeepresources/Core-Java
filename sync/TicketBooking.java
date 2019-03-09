package sync;

public class TicketBooking extends Thread {

	static int total = 10;

	public synchronized static void bookTicket() {
		if (total > 0) {
			total--;
			System.out.println("Tickets =" + total);
		} else
			System.out.println("Tickets sold out");
	}

	@Override
	public void run() {
		bookTicket();
	}

}
