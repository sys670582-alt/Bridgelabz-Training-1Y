import java.util.Scanner;
public class VolumeOfcylinder{
	public static void main(String [] args){
	Scanner input = new Scanner(System.in);
	System.out.print("enter the radius of cylinder");
	double radius = input.nextDouble();
	System.out.print("enter the length of cylinder");
	double height = input.nextDouble();
	System.out.print("enter the height");
	double volume =Math.PI *radius * radius *height;
	System.out.print(" volume of cylinder :" +volume);
	}
	}