package pack1;

import java.util.Arrays;

public class Main2 
{
	public static void question3(String st[])
	{
		for(int i=1; i<st.length;i++)
		{
			String key=st[i];
			int j=i-1;
			while((j>=0&&st[j].length()>key.length()) || (j>=0&&st[j].length()==key.length()&&st[j].charAt(0)>key.charAt(0)))
			{
				st[j+1]=st[j];
				j--;
			}
			st[j+1]=key;
		}
		System.out.println(Arrays.toString(st));
	}

	public static void main(String[] args)
	{
		String st[]= {"banana","abcdeg", "pear", "kiwi","ciku","apple","orange"};
		question3(st);
	}
}
