package Chapter4;

import java.util.*;

public class CertificateOfDeposit 
{
	private int certificateNum;
	private String lastName;
	private double balance;
	private GregorianCalendar issueDate;
	private GregorianCalendar maturityDate;
	
	public CertificateOfDeposit(int certificateNum, String lastName, double balance, int year, int month, int day)
	{
		this.certificateNum = certificateNum;
		this.lastName = lastName;
		this.balance = balance;
		
		this.issueDate = new GregorianCalendar(year, month, day);
		this.maturityDate = (GregorianCalendar) this.issueDate.clone();
		this.maturityDate.add(Calendar.YEAR, 1);
		
	}
	
	public void setCertificateNum(int num)
	{
		this.certificateNum = num;
	}
	
	public int getCertificateNum()
	{
		return this.certificateNum;
	}
	
	public void setBalance(double balance)
	{
		this.balance = balance;
	}
	
	public double getBalance()
	{
		return this.balance;
	}
	
	public void setLastName(String name)
	{
		this.lastName = name;
	}
	
	public String getLastName()
	{
		return this.lastName;
	}
	
	public void setIssueDate(GregorianCalendar date)
	{	
		
		
		this.issueDate = date;
		
	}
	
	public GregorianCalendar getIssueDate()
	{
		return this.issueDate;
	}
	
	public void setMaturityDate(GregorianCalendar date)
	{
		this.issueDate = date;
	}
	
	public GregorianCalendar getMaturityDate()
	{
		return this.maturityDate;
	}
	
	public void display()
	{
		System.out.println("Issue date: " + getIssueDate() + ", Maturity data: " + getMaturityDate() );
		
	}
	

}
