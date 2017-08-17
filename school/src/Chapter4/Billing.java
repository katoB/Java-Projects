package Chapter4;

public class Billing 
{
	final double TAX = 0.08;
	
	public double computeBill(double price)
	{
		double total = price + TAX;
		
		System.out.println("Photo price: $" + price + " total: $ " + total );
		
		return total;
	}
	
	public double computeBill(double price, int quantity)
	{
		double total = (price * quantity) + TAX;
		
		System.out.println("Photo price: $" + price + " Quantity: " + quantity + " total: $ " + total );
		
		return total;
	}
	
	public double computeBill(double price, int quantity, int coupon)
	{
		double total = ((price * quantity) - coupon) + TAX;
		
		System.out.println("Photo price: $" + price + " Quantity: " + quantity + " Coupon: $" + coupon + " total: $ " + total );
		
		return total;
	}
	
	public static void main(String [] args)
	{
		Billing book = new Billing();
		
		book.computeBill(5);
		book.computeBill(5, 5);
		book.computeBill(5, 5, 5);
		
	}

}
