import java.util.Scanner;
class PrintMessage{

      public static void printMessage(String str)
	{
	   System.out.println("Hi, Good Morning! "+str);
	}

      public static void main(String[] args)
	{
	   Scanner myobj = new Scanner(System.in);
	   System.out.println("Enter the Name");
	   String str = myobj.nextLine();
	   printMessage(str);
	}
}