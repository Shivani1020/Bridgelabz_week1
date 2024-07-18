import java.util.Scanner;
class Greeting{
     public static void main(String[] args){
	Scanner myobj = new Scanner(System.in);
	System.out.println("Enter the name and age: ");
	String name = myobj.nextLine();
	int age = myobj.nextInt();
	System.out.println("Hello " +name + " Your age is "+age);
}
}