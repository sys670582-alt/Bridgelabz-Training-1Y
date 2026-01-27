import java.util.Scanner;
public class RocketCountdown{
public static void main(String[]args){
Scanner yu = new Scanner(System.in);
System.out.println("Enter a number");
int x =yu.nextInt();
while(x>=1){
System.out.println(x);
x--;
}
System.out.println("Launch");
}
}
