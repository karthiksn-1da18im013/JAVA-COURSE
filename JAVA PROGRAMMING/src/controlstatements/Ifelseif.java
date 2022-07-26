package controlstatements;
import java.util.Scanner;
public class Ifelseif {

public static void main(String[] args) {
		
		// If-ElseIf-Else statement
	
	Scanner sc = new Scanner(System.in);
        float num1 = sc.nextFloat();
		float num2 = sc.nextFloat();
		
		
		// largest between 2 numbers
		
		if (num1>num2) {
			System.out.println("num1 is greater than num2");
			
		}
		else if (num1==num2) {
			System.out.println("num1 is equal to num2");
		
		}
		else {
			System.out.println("num1 is less than num2");
		}
		

	}

}