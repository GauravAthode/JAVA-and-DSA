package practiceAssignmentPart2;

public class Main9
{
    public static int fibonacci(int n)
    {
        if (n==0) 
        {
            return 0;
        } 
        if (n==1)
        {	
            return 1;
        }   
        return fibonacci(n-1)+fibonacci(n-2);
    }

    public static void printFibonacci(int n, int i)
    {
        if (i==n) 
        {
            return;
        }
        System.out.print(fibonacci(i));
        printFibonacci(n,i+1);
    }

    public static void main(String[] args)
    {
        int n =4;
        printFibonacci(n, 0);
    }
}
