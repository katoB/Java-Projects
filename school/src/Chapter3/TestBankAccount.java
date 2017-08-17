package Chapter3;

import java.util.Scanner;

public class TestBankAccount 
{
	public static void main(String [] args)
	{
		
		BankAccount bankAccount1 = new BankAccount();
		BankAccount bankAccount2 = new BankAccount();
		BankAccount bankAccount3 = new BankAccount();
		BankAccount bankAccount4 = new BankAccount();
		
		bankAccount1 = getData(bankAccount1);
		bankAccount2 = getData(bankAccount2);
		bankAccount3 = getData(bankAccount3);
		
		
		showValues(bankAccount1);
		showValues(bankAccount2);
		showValues(bankAccount3);
		showValues(bankAccount4);

	}
	
	public static BankAccount getData(BankAccount b)
	{
		Scanner keyboard = new Scanner(System.in);
        
        System.out.println("What is the account number?");
        b.setAccNumber(keyboard.nextLine()); 
        
        System.out.println("What is the account name?");
        b.setName(keyboard.nextLine());
        
        System.out.println("What is the account balance?");
        b.setBalance(keyboard.nextInt());
        
        return b;
	}
	
	public static BankAccount showValues(BankAccount s)
	{
		System.out.println("Acc number is: " + s.getAccNumber() + ". Acc name is: " + s.getName() + ". Acc balance is: $" + s.getBalance());
		
		s.deductMonthlyFee();
		
		System.out.println(s.getName() + " balance is now $" + s.getBalance());
		
		s.explainAccountPolicy();
		
		return s;
	}
	
}
