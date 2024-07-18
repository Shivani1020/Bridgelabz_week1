import java.util.Scanner;
class Comparission{
     public static void main(String[] args){
	Scanner myobj = new Scanner(System.in);
	System.out.println("Enter the number to compare:");
	int num = myobj.nextInt();
	if (num<0)
	    System.out.println("The entered number is negative");
	else if (num>0)
	    System.out.println("The entered number is positive");
	else
	    System.out.println("The entered number is zero");
   }
}