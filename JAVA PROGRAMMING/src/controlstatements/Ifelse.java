package controlstatements;

public class Ifelse {

public static void main(String[] args) {
		
		/* conditional statement syntax
		 if(condition){
		   Statement1;
		 }else {
		   statement2;
		 }
		 */
		int a = 10;
		int b = 5;
		
		if(a>b) {
			a=0;
			System.out.println("a value becomes zero since if statement is true:" +a);
		}
		else {
			b=0;
			System.out.println("b value becomes zero since if statement is false"+b);
		}
	}

}
