import java.util.Scanner;
public class SimpleIntrest{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.print("enter the princple");
		double princple= input.nextDouble();
		System.out.print("enter the radius");
		double radius=input.nextDouble();
		System.out.print("enter the time");
		double time=input.nextDouble();
		double SimpleIntrest = (princple * radius * time) /100;
		System.out.println("the total value:" + SimpleIntrest);
		}
		}