package pack1;

import java.util.*;

public class main34 
{
	public static int find( String s)
	{
		HashMap<Character,Integer> map=new HashMap<>();
		for(char c:s.toCharArray())
		{
			map.put(c,map.getOrDefault(c,0)+1);
		}
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(2==map.get(s.charAt(i)))
			{
				count++;
			}
		}
		return count/2;
		
	
	}

	public static void main(String[] args) 
	{
		String s="adfefefssad";
		System.out.println(find(s));
	}

}
