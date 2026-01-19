import java.util.Scanner;
public class AverageOfThreeNumber{
	public static void main( String [] args){
	Scanner input = new Scanner(System.in);
	System.out.print("enter first no");
	double first = input.nextDouble();
	System.out.print("enter second no");
	double second = input.nextDouble();
	System.out.print("enter third no");
	double third = input.nextDouble();
	double Average = (first + second + third)/3;
	System.out.print("the average of three no :" + Average);
	}
	}