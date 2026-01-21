import java.util.Scanner;
public class Calculator{
public static void main(String [] args ){
Scanner sc = new Scanner(System.in);
System.out.println("choose first number");
double num1 = sc.nextDouble();
System.out.println("choose second number");
double num2 =sc.nextDouble();
System.out.println("choose an operation");
System.out.println("1.addition (+)");
System.out.println("2.subtraction (-)");
System.out.println("3.multiplication (*)");
System.out.println("4.Division (/)");
System.out.println("Choose a number");
int number = sc.nextInt();
double result;
switch (number){
	case 1:
	result = num1+num2;
	System.out.println("Result:"+result);
	break;
	case 2:
	result = num1-num2;
	System.out.println("Result:" +result);
	break;
	case 3:
	result = num1*num2;
	System.out.println("Result:" +result);
	break;
	case 4:
	result = num1/num2;
	System.out.println("Result:" +result);
	break;
	default:
System.out.println("invalid operator");
}
sc.close();
}
}
