import java.util.Scanner;
class Precedence{
      public static void main(String[] args){
	Scanner myobj = new Scanner(System.in);
	System.out.println("Enter 3 numbers");
	int num1 = myobj.nextInt();
	int num2 = myobj.nextInt();
	int num3 = myobj.nextInt();
	int result1 = num1 + num2*num3;
	System.out.println("Result for expression num1 + num2*num3 is "+result1);
	int result2 = (num1+num2) * num3;
	System.out.println("Result for expression (num1+num2) * num3 is "+result2);
	int result3 = num1 - num2/num3;
	System.out.println("Result for expression num1 - num2/num3 is "+result3);
	int result4 = (num1 - num2) / num3;
	System.out.println("Result for expression (num1 - num2)/num3 is "+result4);
     }
}