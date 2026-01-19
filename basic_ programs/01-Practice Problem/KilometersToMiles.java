import java.util.Scanner;
public class KilometersToMiles{
	public static void main(String [] args){
	Scanner input = new Scanner(System.in);
	System.out.print("enter the killometer");
	double killometer = input.nextDouble();
	double miles = killometer * 0.621371;
	System.out.print("Distance in  miles" + miles);
	}
	}