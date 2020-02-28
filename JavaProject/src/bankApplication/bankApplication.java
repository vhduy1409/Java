package bankApplication;

import java.util.LinkedList;
import java.util.List;

public class bankApplication
{
	public static void main(String[] args)
	{
		
		String file = "E:\\NewBankAccounts.csv";
		
		/*
		Checking checkAccount = new Checking("Hoang Duy", "123456789", 10000);
		
		Saving savingAccount = new Saving("Ricky Star", "234567891", 15000);
		
		checkAccount.showInfo();
		
		System.out.println("***************");
		
		
		savingAccount.showInfo();
		
		savingAccount.compound();
		
		checkAccount.compound();
		
		checkAccount.deposit(5000);
		
		savingAccount.withdraw(5000);
		
		checkAccount.transfer(5000, "Hoang Duy");
		*/
		List<Account> accounts = new LinkedList<Account>();
	
		List<String[]> newAccountHolder = Utility.CSV.read(file);
		for(String[] accountHolder : newAccountHolder)
		{
			
			String name = accountHolder[0];
			String sSn = accountHolder[1];
			String accountType = accountHolder[2];
			double deposit = Double.parseDouble(accountHolder[3]);
			if(accountType.equals("Savings"))
			{
				System.out.println("Open Saving Acccount");
				accounts.add(new Saving(name, sSn, deposit));
			}else if(accountType.equals("Checking"))
			{
				System.out.println("Open Checking Acccount");
				accounts.add(new Checking(name, sSn, deposit));

			}else
			{
				System.out.println("Error Reading Account");
			}
				
				
		}
		for(Account acc : accounts) {
			System.out.println("***************");
			 accounts.get(5).showInfo();

		}
		 
	}
}