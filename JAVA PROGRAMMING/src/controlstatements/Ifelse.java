package controlstatements;

public class Ifelse {

	import java.util.Scanner;

	public class IfElseEvenOdd {

		public static void main(String[] args) {
			
			//to determine the number entered is even or odd
			
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			int rem = num % 2;
			
			// condition of even and odd
			if(rem==0) {
				System.out.println("The number entered is EVEN");
			}
			else {
				System.out.println("The number entered is ODD");
			}

		}

	}
