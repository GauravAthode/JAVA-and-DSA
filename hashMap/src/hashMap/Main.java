package hashMap;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
public class Main
{

	public static void main(String[] args) 
	{
		String s="swiss";
		HashMap<Character, Integer> map=new HashMap<>();
//		map.put(1, "apple");
//		map.put(2, "banana");
//		map.put(3, "graps");
//		map.remove(3);
//		map.remove(2,"banana");
//		System.out.println(map);
		
		for(char c:s.toCharArray())
		{
			map.put(c,map.getOrDefault(c,0)+1);
		}
	
		char result ='\0';
		for(int i=0; i<s.length();i++)
		{
			if(map.get(s.charAt(i))==1)
			{
				result=s.charAt(i);
				break;
			}
			
		}
		if(result=='\0')
		{
			System.out.println("no non repeated value");
		}
		else
		{
			System.out.println("first repeated value = "+result);
		}
		

	}

}
