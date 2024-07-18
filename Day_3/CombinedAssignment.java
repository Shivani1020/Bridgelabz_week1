import java.util.Scanner;
class CombinedAssignment{
      public static void main(String[] args){
	Scanner myobj = new Scanner(System.in);
	System.out.println("Enter 2 numbers: ");
	int num1 = myobj.nextInt();
	int num2 = myobj.nextInt();
	num1 += num2;
	System.out.println("num1 += num2: "+num1);
	num1 -= num2;
	System.out.println("num1 -= num2: "+num1);
	num1 *= num2;
	System.out.println("num1 *= num2: "+num1);
	num1 /= num2;
	System.out.println("num1 /= num2: "+num1);
    }
} 