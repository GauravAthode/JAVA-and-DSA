package conditional_assignment_part2;

public class Main14 
{
	public static void finaltotal(int quantity,int price)
	{
		int beforediscount=quantity*price;
		System.out.println("Total amount: "+beforediscount);
		if(quantity>=100)
		{
			double discount=beforediscount*10/100;
			double finaltotal=beforediscount-discount;
			System.out.println("discount: "+discount);
			System.out.println("final With discount: "+ finaltotal );
		}
		else 
		{
			System.out.println("no discount is applied");
		}
	} 
	public static void main(String[] args) 
	{
		int quantity=150;
		int price=20;
		finaltotal(quantity,price);
	}
}
