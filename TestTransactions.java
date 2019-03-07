package custom;

public class TestTransactions {

	public static void main(String[] args) {
		
		Transaction t = new Transaction();
		t.setBalance(10000.45f);
		
		try {
			t.deposit(-1000);
		} catch (NegativeAmountException e) {
			e.printStackTrace();
			e.printException();
		}

	}
}
