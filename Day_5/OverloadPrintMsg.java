import java.util.Scanner;
class OverloadPrintMsg{
      public static void printMessage(String str)
	{
	   System.out.println("This method prints the string value\nEntered string is: "+str);
	}
      public static void printMessage(int num)
	{
	   System.out.println("This method prints the integer value\nEntered interger value is: "+num);
	}
      public static void main(String[] args)
	{
	   Scanner myobj = new Scanner(System.in);
	   System.out.println("Enter a string: ");
	   String str = myobj.nextLine();
	   System.out.println("Enter a integer:");
	   int num = myobj.nextInt();
	   printMessage(str);
	   printMessage(num);
	}
}