import java.util.Scanner;
	public class CelciusToFahrenheit{
		public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("enter the Celcius");
		double celcius = input.nextDouble();
		double fahrenhite = (celcius * 9 / 5)+32;
		System.out.print("temp in fahrenhite :" + fahrenhite);
		input.close();
		}
		}