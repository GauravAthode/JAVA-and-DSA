package conditional_assignment_part2;

public class Main19 
{
	public static void calculateGrade(int s1,int s2,int s3,int s4,int s5)
	{
		double totalMarks=s1+s2+s3+s4+s5;
		System.out.println("Total Marks = "+totalMarks);
		double percent=totalMarks/5;
		System.out.println("Percentage = "+percent+"%");
		System.out.println(percent>=90? "Grade: A" : percent>=80? "Grade: B" : percent>=70? "Grade: C" : percent>=60? "Grade: D" : percent>=40? "Grade: E" : "Grade: F");
	}
	public static void main(String[] args) 
	{
		int s1=34;
		int s2=54;
		int s3=90;
		int s4=68;
		int s5=85;
		calculateGrade(s1,s2,s3,s4,s5);
	}
}
