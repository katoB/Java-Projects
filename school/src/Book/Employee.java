package Book;

public class Employee 
{
	public static void main(String [] args)
	{
		
		Employee clerk = new Employee();
		Employee driver = new Employee();
		
		clerk.empNum =1;
		driver.setEmpNum(321);
		
		System.out.println("The clerk employee number is " +clerk.getEmpNum()+ ". The driver employee number is " +driver.getEmpNum());
		
		
	}
	
	private int empNum;
	
	private void setEmpNum(int num)
	{
		empNum = num;
	}
	
	private int getEmpNum()
	{
		return empNum;
	}

}

