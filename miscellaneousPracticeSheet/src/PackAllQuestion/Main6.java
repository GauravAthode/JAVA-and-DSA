package PackAllQuestion;

public class Main6 
{
	public static void main(String[] args)
	{
		int input=10;
		int i=0; 
		do 
		{
			input = input/10;
			i++;
		} 
		while (input!=0);
	
		System.out.println("number of digits is : "+i);
	}
}
