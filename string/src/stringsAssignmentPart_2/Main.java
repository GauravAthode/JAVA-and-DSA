package stringsAssignmentPart_2;

import java.lang.classfile.attribute.CharacterRangeTableAttribute;
import java.lang.classfile.instruction.SwitchCase;
import java.util.Arrays;

public class Main 
{
//	Que 1. Write a Java program to split a sentence into
//	words using space (" ") as the delimiter.
//	Input: String str = "Java is fun";
//	Output: Java
//	        is
//	        fun
	public static void question1()
	{
		String str="  Java    is fun";
		String newStr[]=str.split(" ");
		for(String val:newStr)
		{
			System.out.print(val);
		}
	}
	
//	Que 2. Write a Java program to split a list of names
//	separated by commas.
//	Input: String str = "John,David,Michael,Robert";
//	Output: John
//	        David
//	        Michael
//	        Robert
	public static void question2()
	{
		String str="John,David,Michael,Robert";
		String newStr[]=str.split(",");
		for(String val:newStr)
		{
			System.out.println(val);
		}
		
	}
	
//	Que 3. Write a Java program to split a string that
//	contains multiple consecutive delimiters (|) and
//	preserve empty values using limit = -1.
//	Input: String str = "A|B|||C|";
//	Output: [A]
//	 [B]
//	 []
//	 []
//	 [C]
//	 []
	public static void question3()
	{
		String str="A|B|||C|";
		String newStr[]=str.split("\\|",-1);
		for(String val:newStr)
		{
			System.out.println("["+val+"]");
		}
	}
	
//	Que 4. Write a Java program to split a string by hyphen
//	(-) and limit the result to 3 parts only.
//	Input: String str = "Java-is-a-popular-language";
//	Output: Java
//	 is
//	 a-popular-language
	public static void question4()
	{
		String str="Java-is-a-popular-language";
		String newStr[]=str.split("-",3);
		for(String val:newStr)
		{
			System.out.print(val);
		}
	}
	
//	Que 5. Given a string str, the task is to reverse the
//	order of the words in the given string.
//	Note that str may contain leading or trailing dots(.) or
//	multiple trailing dots(.) between two words. The
//	returned string should only have a single dot(.)
//	separating the words.
//	Input: str = “i.like.this.program.very.much”
//	Output: str = “much.very.program.this.like.i”
	public static void question5()
	{
		String str="...i..like..this...program..very...much....";
		str=str.replaceAll("^\\.+|\\.+$"," ");
		String newStr[]=str.split("\\.+");
		StringBuilder sBuilder=new StringBuilder();
		for(int i=newStr.length-1;i>=0;i--)
		{
			if(i!=0)
			{
				sBuilder.append(newStr[i]);
				sBuilder.append(".");
			}
		}
		String reveString=new String(sBuilder);
		System.out.println(reveString);
		
	}
	
	public static void question7(String arr[])
	{
		StringBuilder sBuilder=new StringBuilder();
		
		
	}
	
	public static void question8(String str)
	{ 
		
	}
	public static int valueRoman(char ch)
	{
		switch (ch)
		{
		case 'I': 
			return 1;
		case 'V': 
			return 5;
		case 'X': 
			return 10;
		case 'L': 
			return 50;
		case 'C': 
			return 100;
		case 'D': 
			return 500;
		case 'M': 
			return 1000;
		default:
			return 0;
		}
		
	}
	
	public static boolean question9(String str) 
	{
		String prevString;
		do
		{
			prevString=str;
			str=str.replace("()","");
			str=str.replace("{}","");
			str=str.replace("[]","");
			
		} 
		while (!str.equals(prevString));
		return str.isEmpty();
		
		
	}
	
	public static void question10() 
	{
		String heyStack="saadbutsaad";
		String niddle="sad";
		System.out.println(heyStack.indexOf(niddle));
	}
	
	
	public static void question12(String str)
	{
		str.trim();
		String arr[]=str.split(" ");
		System.out.println(arr[0]);
		
	}
	
	
	public static boolean question14(String str,String gole) 
	{
		String s=str+str;
		return s.contains(gole);
		
	}

	

	public static void main(String[] args) 
	{
		question1();
		
		//question2();
		
		//question3();	
		
		//question4();
		
		//question5();
		
//		String str[]= {"flower","flow","flight"};
//		question7(str);
		
		
//		String romanString="IV";
//		question8(romanString );
		
		
//		String str="(){}[]";
//		System.out.println(question9(str));
		
		
//		question10();
		
		
//		String str= " Hello Whorld ";
//		question11(str);
		
		
		String str="a car rac, a";
		question12(str);
		
//		String str="abcde";
//		String gole="cdeab";
//		System.out.println(question14(str,gole));
		
	}

}
