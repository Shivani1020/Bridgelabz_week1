import java.util.Scanner;
class NumCheck{
      public static void main(String[] args){
	Scanner myobj = new Scanner(System.in);
	System.out.println("Enter the number to check:");
	int num = myobj.nextInt();
	if (num >=1 && num<=100)
	     System.out.println("The entered number lies between 1 and 100");
	else
	     System.out.println("The entered number doesnot lies between 1 and 100");
}
}
	