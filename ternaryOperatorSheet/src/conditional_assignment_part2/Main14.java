package conditional_assignment_part2;

public class Main14 
{
	public static void finalTotal(int quantity,int price)
	{
		int beforediscount=quantity*price;
		System.out.println(quantity>100? "Final total = "+(beforediscount-(beforediscount*0.1)) : "no discount id applide");
	}
	public static void main(String[] args) 
	{
		int quantity=150;
		int price=20;
		finalTotal(quantity,price);
	}
}
