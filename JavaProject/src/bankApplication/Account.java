package bankApplication;

public abstract class Account implements IBaseRate {
	//List common properties for saving and cheing accounts
	private String name;
	private String ssn;
	protected String accountNumber;
	
	private static int index = 10000;
	private double balance;
	protected double rate;
	
	//constructor to set base propertese and initatlize the account
	
	public Account(String name, String ssn, double initDeposit) 
	{
			
		this.name = name;
		this.ssn = ssn;
		balance = initDeposit;

		
		index++;
		
		this.accountNumber = setAccountNumber();
		setRate();

	}
	
	public abstract void setRate();
	
	
	private String setAccountNumber()
	{
		String lastTwoSSN = ssn.substring(ssn.length()-2, ssn.length());
		int uniqueID = index;
		
		int randomNumber = (int) (Math.random() * Math.pow(10, 3));
		return lastTwoSSN + uniqueID + randomNumber;
	}
	
	public void compound()
	{
		double accureInterest = balance * (rate/100);
		balance = balance + accureInterest;
		System.out.println("Accure interest $" + accureInterest);
		System.out.println(balance);
	}
	
	public void deposit(double amount)
	{
		balance = balance + amount;
		System.out.println("Deposit $ " + amount);
		System.out.println(balance);

	}
	
	public void withdraw(double amount)
	{
		balance = balance - amount;
		System.out.println("Withdraw $ " + amount);
		System.out.println(balance);
	}
	
	public void transfer(double amount, String where)
	{
		balance = balance - amount;
		System.out.println("Transfer $ " + amount + " " + where);
		System.out.println(balance);
	}
	
	public void printBalance()
	{
		System.out.println("Your balance now is $ " + balance);
	}
	
	public void showInfo()
	{
		System.out.println("Name: " + name );
		System.out.println("Account Number: " + accountNumber );
		System.out.println("Balance: " + balance);
		
	

	}
}
