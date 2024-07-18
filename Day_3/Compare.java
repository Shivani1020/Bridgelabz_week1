import java.util.Scanner;
class Compare{
      public static void main(String[] args){
	Scanner myobj = new Scanner(System.in);
	System.out.println("Enter the two umber to compare: ");
	int num1 = myobj.nextInt();
	int num2 = myobj.nextInt();
	
	if(num1 < num2)
	    System.out.println(num1+" is smaller than "+num2);
	else if (num1 >num2)
	    System.out.println(num1+" is greater than "+num2);
	else if (num1 == num2)
	    System.out.println(num1+" is equal to "+num2);
	}
}