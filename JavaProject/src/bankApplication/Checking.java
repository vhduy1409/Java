package bankApplication;

public class Checking extends Account{
	//list properties 
	private int debitCardNumber;
	private int debitCardPin;
	//constructor to initialize checking account properties
	public Checking(String name, String ssn, double initDeposit)
	{
		super(name, ssn, initDeposit);
		
		
		accountNumber = "1" + accountNumber;
		
		setDebitCardFunction();
		
	}
	@Override
	public void setRate()
	{
		rate = getBaseRate() * 0.15;
	}
	
	private void setDebitCardFunction()
	{
		debitCardNumber = (int) (Math.random() * Math.pow(10, 12));
		debitCardPin = (int) (Math.random() * Math.pow(10, 4));
	}
	
	public void showInfo()
	{
		super.showInfo();
		System.out.println("Account type: Checking");
		System.out.println("Debit Card Number: " + debitCardNumber);
		System.out.println("Debit Card Pin: " + debitCardPin);
		System.out.println("Rate of Checking " + rate + "%");

		
		
	}
	//list method
}
