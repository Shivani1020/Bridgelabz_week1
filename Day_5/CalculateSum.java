import java.util.Scanner;
class CalculateSum{
      public static int calculateSum(int n, int m)
	{
	   int sum = 0;
	   sum = n+m;
	   return sum;
	}
      public static void main(String[] args)
	{
	   Scanner myobj = new Scanner(System.in);
	   System.out.println("Enter the numbers to calculate sum:");
	   int result;
	   int num1 = myobj.nextInt();
	   int num2 = myobj.nextInt();
	   result=calculateSum(num1,num2);
	   System.out.println("The sum of two numbers is: "+result);
	}
}