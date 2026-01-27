import java.util.Scanner;
public class Vote{
public static void main(String[]args){
Scanner trio = new Scanner(System.in);
int y = trio.nextInt();
if(y > 17 ){
System.out.println("The person age is" +y+ "and can vote");
}
else{
System.out.println("The person age is" +y+ "and cannot vote");
}
}
}
