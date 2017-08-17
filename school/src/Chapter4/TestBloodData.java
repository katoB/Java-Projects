package Chapter4;

public class TestBloodData 
{
	public static void main(String [] args)
	{
		BloodData blood = new BloodData();
		
		blood.display();
		blood.setBloodType('B');
		blood.setRHfactor('-');
		blood.display();
	}

}
