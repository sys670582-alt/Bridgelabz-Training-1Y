import java.util.Scanner;
public class Smallest{
public static void main(String [] args){
Scanner strike = new Scanner(System.in);
System.out.println("Enter num 1");
double num1 = strike.nextDouble();
System.out.println("Enter num2");
double num2 =strike.nextDouble();
System.out.println("Enter num3");
double num3 =strike.nextDouble();
if(num1 < num2 && num1 < num3){
System.out.println("is first smallest number?Yes");
}else{
System.out.println("is first smallest number?No");
}
}
}