import java.util.Scanner;
public class NaturalNumber{
public static void main(String[]args){
Scanner a = new Scanner(System.in);
System.out.println("enter a number");
int x =a.nextInt();
if(x > 0){
int sum = x*(x+1)/2;
System.out.println("The sum of" +x+ "natural number is"+sum);
}else{
System.out.println("The number is not natural number");
}
}
}