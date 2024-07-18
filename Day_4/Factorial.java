import java.util.Scanner;
class Factorial{
      public static void main(String[] args){
	Scanner myobj = new Scanner(System.in);
	int i = 1;
	int fact = 1;
	System.out.println("Enter a number");
	int num = myobj.nextInt();
	if (num == 1)
	   System.out.println("Factorial is 1");
	while(i<=num)
	{
	   fact *=i;
	   i++;
	}
	System.out.println("The factorial of "+num+" is "+fact);
  }
}