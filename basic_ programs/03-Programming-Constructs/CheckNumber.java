import java.util.Scanner;
public class CheckNumber{
public static void main(String[]args){
Scanner Sky = new Scanner(System.in);
System.out.println("Input a number");
int x = Sky.nextInt();
if(x >0){
System.out.println("Positive");
}
else if(x<0){
System.out.println("Negative");
}
else{
System.out.println("Zero");
}
}
}