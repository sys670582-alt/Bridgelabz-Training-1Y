import java.util.Scanner;
public class Largest{
public static void main(String[]args){
Scanner Tannu = new Scanner(System.in);
System.out.println("Enter a num1");
double num1=Tannu.nextDouble();
System.out.println("Enter a num2");
double num2 =Tannu.nextDouble();
System.out.println("Enter a num3");
double num3 =Tannu.nextDouble();
if(num1>num2&&num1>num3){
System.out.println("Is first number the largest?Yes");
}else{
System.out.println("Is first number the largest?No");
}
if(num2>num1&&num2>num3){
System.out.println("Is the second number the largest?Yes");
}else{
System.out.println("Is the second number the largest?No");
}
if(num3>num1&&num3>num2){
System.out.println("Is the  third number largest?Yes");
}else{
System.out.println("Is the third number is largest?No");
}
}
}