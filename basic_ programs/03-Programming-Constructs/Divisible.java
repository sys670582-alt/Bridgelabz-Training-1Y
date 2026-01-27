import java.util.Scanner;
public class Divisible{
public static void main(String[]args){
System.out.println("Enter a number");
Scanner ayush =new Scanner(System.in);
Double x = ayush.nextDouble();
if( x % 5==0){
System.out.println("is Divisible by 5" );
}
else{
System.out.println("Is not divisible by 5");
}
}
}
