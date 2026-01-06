package arrayListAssignmentPart1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main
{
	public static void question1()
	{
		System.out.println("Question1");
		ArrayList<String> colors=new ArrayList<String>();
		colors.add("blue");
		colors.add("green");
		colors.add("red");
		System.out.println(colors);
	}
	
	public static void question2() 
	{
		System.out.println("Question2");
		ArrayList<String> colors=new ArrayList<String>();
		colors.add("blue");
		colors.add("green");
		colors.add("red");
		for(int i=0; i<colors.size();i++)
		{
			System.out.println(colors.get(i));
		}
	}
	
	public static void question3() 
	{
		System.out.println("Question3");
		ArrayList<String> colors=new ArrayList<String>();
		colors.add("blue");
		colors.add("green");
		colors.add("red");
		for(String val: colors)
		{
			System.out.println(val);
		}
	}
	
	public static void question4() 
	{
		System.out.println("Question4");
		ArrayList<String> colors=new ArrayList<String>();
		colors.add("blue");
		colors.add("green");
		colors.add("red");
		
	}
	
	public static void question5()
	{
		System.out.println("Question5");
		ArrayList<String> colors=new ArrayList<String>();
		colors.add("blue");
		colors.add("green");
		colors.add("red");
		
	}
	
	public static void question6()
	{
		System.out.println("Question5");
		ArrayList<String> colors=new ArrayList<String>();
		colors.add("blue");
		colors.add("green");
		colors.add("red");
		colors.set(1, "yellow");
		System.out.println(colors);
		
	}
	
	public static void question7()
	{
		ArrayList<String> colors=new ArrayList<String>();
		colors.add("blue");
		colors.add("green");
		colors.add("red");
		
	}
	public static void question9()
	{
		ArrayList<String> colors=new ArrayList<String>();
		colors.add("green");
		colors.add("blue");
		colors.add("red");
		Collections.sort(colors);
		System.out.println(colors);
		
	}
	
	public static void question11()
	{
		ArrayList<String> colors=new ArrayList<String>();
		colors.add("green");
		colors.add("blue");
		colors.add("red");
		Collections.shuffle(colors);
		System.out.println(colors);
		
	}
	public static void question12()
	{
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(20);
		list.add(30);
		Collections.reverse(list);
		System.out.println(list);
		
	}
	
	public static void question13()
	{
		ArrayList<Integer> list=new ArrayList<Integer>(List.of(10,20,30,40,50));
		ArrayList<Integer> list1=new ArrayList<Integer>(list.subList(0,3));
		
		System.out.println(list1);
		
	}
	
	public static void question15()
	{
		ArrayList<Integer> list=new ArrayList<Integer>(List.of(10,20,30,40,50));
		Collections.swap(list, 0, 3);
		System.out.println(list);
		
	}
	
	public static void question16()
	{
		ArrayList<Integer> list1=new ArrayList<Integer>(List.of(10,20,30));
		ArrayList<Integer> list2=new ArrayList<Integer>(List.of(40,50,60));
		list1.addAll(list2);
		System.out.println(list1);
		
	}
	
	
	
	
	

	public static void main(String[] args)
	{
//		ArrayList<Integer> list=new ArrayList<Integer>();
//		list.add(50);
//		list.add(10);
//		list.add(30);
//		list.add(40);
//		list.add(5);
//		list.add(20);
//		System.out.println(list);
//		Collections.sort(list);
//		System.out.println(list);
//		Collections.reverse(list);
//		System.out.println(list);
//		Collections.shuffle(list);
//		System.out.println(list);
//		int max=Collections.max(list);
//		System.out.println(max);
//		int min=Collections.min(list);
//		System.out.println(min);
//		Collections.swap(list, 0, 1);
//		System.out.println(list);
//		Collections.fill(list, 99);
//		System.out.println(list);
//		list.clear();
//		System.out.println(list);
//		int index=Collections.binarySearch(list,30 );
//		System.out.println(index);
//		Collections.rotate(list, 2);
//		System.out.println(list);
//		Collections.addAll(list,1, 2,3);
//		System.out.println(list);
//		int frq=Collections.frequency(list, 40);
//		System.out.println(frq);
		
//		question1();
//		
//		question2();
//		
//		question3();
//		
//		question4();
//		
//		question5();
		
//		question6();
		
//		question7();
		
//		question9();
		
//		question11();
		
//		question12();
		
//		question13();
		
//		question15();
		
		question16();
		
		
		
		

	}

}
