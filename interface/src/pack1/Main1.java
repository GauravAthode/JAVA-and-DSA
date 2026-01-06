package pack1;

import java.util.ArrayList;

public class Main1
{

	public static void main(String[] args) 
	{
		ArrayList  al=new ArrayList();
		al.add(10);
		al.add(null);
		al.add(null);
		al.add(3,12);
		for(Object valObject : al)
		{
			System.out.println(al+" ");
		}
		
		
	}

}
