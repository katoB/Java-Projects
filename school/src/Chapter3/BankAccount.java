package Chapter3;

public class BankAccount 
{
	private String accNumber;
	private String name;
	private int balance;
	
	public BankAccount()
	{
		accNumber = "99999";
		name = "XXXXXX";
		balance = 0;
	}
	
	public void setAccNumber(String num)
	{
		accNumber = num;
	}
	
	public String getAccNumber()
	{
		return accNumber;
	}
	
	public void setName(String full)
	{
		name = full;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setBalance(int bal)
	{
		balance = bal;
	}
	
	public int getBalance()
	{
		return balance;
	}
	
	public void deductMonthlyFee()
	{
		final int FEE = 4;
		
		balance = balance - FEE;
	}
	
	public static void explainAccountPolicy()
	{
		System.out.println("A $4 service fee will be deducted each month.");
	}

}
