package conditional_assignment_part3;

public class Main25 
{
	public static String studentDivision(int s1,int s2,int s3,int s4,int s5)
	{
		int totalMarks=s1+s2+s3+s4+s5;
		int percent=totalMarks*100/500;
		if(percent>=60)
		{
			return "First Division";
		}
		else if(percent>=50 && percent<=59)
		{
			return "Second Division";
		}
		else if(percent>=40 && percent<=49)
		{
			return "Third Division";
		}
		else 
		{
			return "Fail";
		}	
	}

	public static void main(String[] args) 
	{
		int s1=71;
		int s2=90;
		int s3=89;
		int s4=73;
		int s5=59;
		String division = studentDivision(s1,s2,s3,s4,s5);
		int totalMarks=s1+s2+s3+s4+s5;
		int percent=totalMarks*100/500;
		System.out.println("The student has obtained "+division+" with "+percent+ "% marks");
	}
}
