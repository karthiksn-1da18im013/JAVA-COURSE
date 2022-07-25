package javaBasics;

public class Logicaloperator {

	

	public static void main(String[] args) {
		// Logical Operator
		
		//&& AND operator
		float a = 25, b= 45,c=25;
		if(a==b&&a==c) {
			System.out.println("True");	
		}else {
			System.out.println("false");
			
		}
		//|| OR operator
		if(c==a||b==a) {
			System.out.println("anyone true");
		}
		
		// ! NOT operator
		if(b!=c) {
			System.out.println("true");
		}
		
	}

}
