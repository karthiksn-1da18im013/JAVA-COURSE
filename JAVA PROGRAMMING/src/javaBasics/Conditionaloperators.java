package javaBasics;

public class Conditionaloperators {

	public static void main(String[] args) {
		// conditional operators- checking the conditions for various expression evaluation
		int a=50;
		int b=20;
		int x=(a>b)?a:b;
		
		if(a>b)   {
			
			System.out.println("a is greater than b,then a value is assigned to x is:"+(x=a));
			
	    }
		
		else {
			
			System.out.println("a is less than b,then b value is assigned to x is :"+(x=b));
			
		}
		
    }
		

}


