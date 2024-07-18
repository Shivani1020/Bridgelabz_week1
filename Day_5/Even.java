import java.util.Scanner;
class Even{
      public static boolean isEven(int num)
	{
	   if (num%2 == 0)
		return true;
	   else
		return false;
	}
      public static void main(String[] args)
	{
	    Scanner myobj = new Scanner(System.in);
	    System.out.println("Enter the number: ");
	    int number = myobj.nextInt();
	    System.out.println(isEven(number));
	}
}