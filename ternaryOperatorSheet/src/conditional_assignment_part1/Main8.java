package conditional_assignment_part1;

public class Main8 
{
	public static String checkVowelConsonant(char ch)
	{
		return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='e'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'?  "Vowel" : "Consonant";
	}
	public static void main(String[] args) 
	{
		char ch ='a';
		System.out.println(checkVowelConsonant(ch));
	}
}