package in.sbp.abstraction.classes;

public abstract class Transaction {
	private int bal;
	public abstract void creditAmount(float amount);
	public abstract void debitAmount(float amount);

}
