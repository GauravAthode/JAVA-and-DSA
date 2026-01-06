package switchStatementSheet;

public class Main7 
{
	public static void q7(double num1,double  num2,char operator)
	{
		switch (operator) 
		{
		case '+': 
		{
			double result = num1+num2;
			System.out.println(result);
			break;
		}
		case '-': 
		{
			double result = num1-num2;
			System.out.println(result);
			break;
		}
		case '*': 
		{
			double result = num1*num2;
			System.out.println(result);
			break;
		}
		case '/': 
		{
			double result = num1/num2;
			System.out.println(result);
			break;
		}
		default:
			System.out.println("input error");
		}
	}
	public static void main(String[] args) 
	{
		double  num1=34;
		double num2=65;
		char operator='+';
		q7(num1,num2,operator);
	}

}
