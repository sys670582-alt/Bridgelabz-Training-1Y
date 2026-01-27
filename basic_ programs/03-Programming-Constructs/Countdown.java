import java.util.Scanner;
public class Countdown{
public static void main(String[]args){
Scanner bro = new Scanner(System.in);
System.out.println("Enter a countdown number");
int x = bro.nextInt();
for(int i=x;i>=1;i--){
System.out.println(i);
}
System.out.println("launch");
}
}