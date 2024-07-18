import java.util.Scanner;
class LeapYear{
      public static void main(String[] args){
	Scanner myobj = new Scanner(System.in);
	System.out.println("Enter the year");
	int year = myobj.nextInt();
	boolean leap_year = false;
	if (year % 4 == 0)
	{
	    leap_year = true;
	    if (year %100 == 0)
		{
		if (year % 400 == 0)
		    leap_year = true;
		else
		    leap_year = false;
		}
	 }
	else
	    leap_year = false;

	if (leap_year == true)
	      System.out.println(year+ " is a leap year");
	else
	      System.out.println(year+" is not a leap year");
    }
}