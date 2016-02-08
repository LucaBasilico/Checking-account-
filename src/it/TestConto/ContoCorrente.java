package it.TestConto;

public class ContoCorrente {
	
	private String name;
	private int identificationNumber = 0;
	private double checkAccount;
	
	public ContoCorrente(){
		
	}
	
	/**
	 * 
	 * @param name nome del correntista
	 * @param checkAccount valore del conto
	 */
	public ContoCorrente(String name, double checkAccount) {
		super();
		this.name = name;
		this.identificationNumber ++;
		this.checkAccount = checkAccount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getidentificationNumber() {
		return identificationNumber;
	}

	public double getcheckAccount() {
		return checkAccount;
	}

	public void setcheckAccount(double checkAccount) {
		this.checkAccount = checkAccount;
	}
	
	public void withdraw(double withdrawQuantityint ){
		this.checkAccount = this.checkAccount - withdrawQuantityint;
	}

	public void deposit(int depositQuantity) {
		// TODO Auto-generated method stub
		this.checkAccount = this.checkAccount + depositQuantity;
	}
	
}
