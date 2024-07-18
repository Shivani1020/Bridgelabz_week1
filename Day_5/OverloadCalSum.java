import java.util.Scanner;
class OverloadCalSum{
      public static void calculateSum(int a, int b)
	{
	   System.out.println("The sum of two numbers: " +(a+b));
	}
      public static void calculateSum(int a, int b, int c)
	{
	   System.out.println("The sum of three numbers: " +(a+b+c));
	}
     public static void main(String[] args)
	{
	   Scanner myobj = new Scanner(System.in);
	   System.out.println("Enter three numbers: ");
	   int num1 = myobj.nextInt();
	   int num2 = myobj.nextInt();
           int num3 = myobj.nextInt();
	   System.out.println("Showing the method overloading");
	   calculateSum(num1, num2);
	   calculateSum(num1, num2, num3);
	   
	}

}