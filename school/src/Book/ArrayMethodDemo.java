public class ArrayMethodDemo{

	public static void main(String [] args)
	{
		int[] integers = {54, 23, 87, 34, 76, 100, 75, 76, 89, 11};

		System.out.println("Displaying the integers");
		display(integers);

		System.out.println();
		System.out.println("Displaying integers in reverse");
		reverse(integers);
		for(int i = 0; i < integers.length; ++i)
		{
			System.out.print(integers[i] + " ");
		}
		System.out.println();

		System.out.println("Displaying the sum");
		System.out.println(sum(integers));

		System.out.println("Displaying integers less than the limit");
		limit(integers, 50);

		//Displaying integers higher than the avg value
		System.out.println("Displaying integers higher than the value");
		avg(integers);

	}


//Displaying the integers in the array
	public static void display(int[] x)
	{
		for(int i : x)
		{
			System.out.print(i + " ");
		}
	}


	public static int[] reverse(int[] x)
	{
		boolean flag = true;

		while(flag)
		{
			flag = false;

			for(int i = 0; i < x.length - 1; ++i)
			{
				if(x[i] < x[i + 1])
				{
					int temp = x[i];
					x[i] = x[i + 1];
					x[i + 1] = temp;
					flag = true;
				}
			}
		}

		return x;
	}

	public static int sum(int[] x)
	{
		int summ = 0;
		for(int i = 0; i < x.length; ++i)
		{
			summ += x[i];
		}

		return summ;
	}

	public static void limit(int[] x, int limit)
	{
		for(int i = 0; i < x.length; ++i)
		{
			if(x[i] < limit)
			{
				System.out.println(x[i]);
			}
		}
	}

	public static void avg(int[] x)
	{

		int sum = sum(x);

		double avg = sum / x.length;

		System.out.println(avg);

		for(int i = 0; i < x.length; ++i)
		{
			if(x[i] > avg)
			{
				System.out.print(x[i] + " ");
			}
		}
	}
}