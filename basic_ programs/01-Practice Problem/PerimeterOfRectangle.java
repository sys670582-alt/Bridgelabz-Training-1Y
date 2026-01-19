import java.util.Scanner;
public class PerimeterOfRectangle{
	public static void main(String [] args){
	Scanner input = new Scanner(System.in);
		System.out.print("enter the length");
		double length= input.nextDouble();
		System.out.print("enter width");
		double width=input.nextDouble();
		double Perimeter =  2 * (length + width);
		System.out.print("peremiter of rectangle :" + Perimeter);
		}
		}