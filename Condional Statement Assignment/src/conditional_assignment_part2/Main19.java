package conditional_assignment_part2;

public class Main19 
{
	public static void calculateGrade(int s1,int s2,int s3,int s4,int s5)
	{
		 double totalmarks=s1+s2+s3+s4+s5;
		System.out.println("Total Marks = "+totalmarks);
		double percent = totalmarks/5;
		System.out.println("Percentage = "+percent+" %");
		if(percent>=90)
		{
			System.out.println("Grade: A");
		}
		else if(percent>=80)
		{
			System.out.println("Grade: B");	
		}
		else if(percent>=70)
		{
			System.out.println("Grade: C");	
		}
		else if(percent>=60)
		{
			System.out.println("Grade: D");	
		}
		else if(percent>=40)
		{
			System.out.println("Grade: E");	
		}
		else 
		{
			System.out.println("Grade: F");		
		}
	}
	public static void main(String[] args) 
	{
		int s1=25;
		int s2=47;
		int s3=15;
		int s4=12;
		int s5=88;
		calculateGrade(s1,s2,s3,s4,s5);
	}
}
