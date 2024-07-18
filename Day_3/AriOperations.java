import java.util.Scanner;
class AriOperations{
      public static void main(String[] args){
	Scanner myobj = new Scanner(System.in);
	
	System.out.println("Enter the two numbers on which arithemetic operations need to be done:");
	int num1 = myobj.nextInt();
	int num2 = myobj.nextInt();
	System.out.println("Enter the operation to be performed:");
	System.out.println("1. Addition\n2. Substraction\n3.Multiplication\n4. Division\n5.Modulus");
	int choice = myobj.nextInt();
	switch(choice){
		case 1: int sum = num1+num2;
			System.out.println("Addition of "+num1+" and "+num2+" is "+sum);
			break;
		case 2: int sub = num1-num2;
			System.out.println("Substraction of "+num1+" and "+num2+" is "+sub);
			break;
		case 3: int mul = num1*num2;
			System.out.println("Multiplication of "+num1+" and "+num2+" is "+mul);
			break;
		case 4: float div = num1 / num2;
			System.out.println("Division of "+num1+" and "+num2+" is "+div);
			break;
		case 5: int mod = num1 % num2;
			System.out.println("Modulus of "+num1+" and "+num2+" is "+mod);
			break;
		default:
			System.out.println("Invalid input");
			break;
	}
    }
}