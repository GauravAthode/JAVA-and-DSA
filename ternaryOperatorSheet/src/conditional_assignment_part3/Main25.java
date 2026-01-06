package conditional_assignment_part3;

public class Main25 
{
	public static String studentDivision(int s1,int s2,int s3,int s4,int s5)
	{
		int totalMarks=s1+s2+s3+s4+s5;
		int percent=totalMarks*100/500;
		return percent>=60? "First Division" : 
			   percent>=50 && percent<=59? "Second Division" :
			   percent>=40 && percent<=49? "Third Division" : "Fail";
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

