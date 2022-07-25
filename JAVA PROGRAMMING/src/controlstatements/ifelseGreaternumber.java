package controlstatements;



	import java.util.Scanner;

	public class ifelseGreaternumber {

		public static void main(String[] args) {
			
			// to check the largest number taking input from user
			
			Scanner sc = new Scanner(System.in);
			float num1 = sc.nextFloat();
			Float num2 = sc.nextFloat();
			
			//condition to print largest number
			
			if (num1>num2) {
				System.out.println("Num1 is greater");
			}
			else {
				System.out.println("Num2 is greater");
			}

		}

	}
	
