import java.util.Scanner;
class CalculateArea{
      public static int calculateArea(int len, int bre)
	{
	   int area;
	   area = len*bre;
	   return area;
	}
      public static void main(String[] args)
	{
	   int result;
	   Scanner myobj = new Scanner(System.in);
	   System.out.println("Enter length and brreadth of rectangle in cm:");
	   int length = myobj.nextInt();
	   int breadth = myobj.nextInt();
	   result = calculateArea(length, breadth);
	   System.out.println("Area of the rectangle is: "+result+" sqcm");
	}
}