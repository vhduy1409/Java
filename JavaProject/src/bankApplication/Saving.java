package bankApplication;

public class Saving extends Account{
	//list properties specific to saving account
	private int safetyDepositBoxID;
	private int safetyDepositBoxKey;
	// constructor to initialize setting for saving propertiese
	public Saving(String name, String ssn, double initDeposit) 
	{
		super(name, ssn, initDeposit);
		
		accountNumber = "2" + accountNumber;

		setSafetyDepositBox();

	}
	@Override
	public void setRate()
	{
		rate = getBaseRate() - 0.25;

	}
	
	private void setSafetyDepositBox()
	{
		safetyDepositBoxID = (int) (Math.random() * Math.pow(10, 3));
		safetyDepositBoxKey = (int) (Math.random()* Math.pow(10, 4));
	}
	
	public void showInfo()
	{
		super.showInfo();
		System.out.println("Saving Account");
		System.out.println("Safety Deposit Box ID: " + safetyDepositBoxID);
		System.out.println("Saving Deposit Key: " + safetyDepositBoxKey);
		System.out.println("Rate of Saving " + rate + "%");

		

	}
	//list any
	
}
