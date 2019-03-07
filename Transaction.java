package custom;

public class Transaction {
	private float balance;

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	void deposit(float amount) throws NegativeAmountException {
		if(amount < 0)
			throw new NegativeAmountException("Negative amount encountered");
		balance += amount;
		System.out.println("Balance= " + balance);
	}
}
