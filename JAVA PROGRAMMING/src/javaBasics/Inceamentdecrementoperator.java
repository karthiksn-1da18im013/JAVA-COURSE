package javaBasics;

public class Inceamentdecrementoperator {
	public static void main(String[] args) {
		// Increment operator
		
		  // pre-incremental operator- m value gets increased by 1 then the value of m is assigned to z
		int m = 10;
		int z = ++m;
		System.out.println("pre-incremental value of m is:"+m);
		System.out.println("pre-incremental value of z is:"+z);
		System.out.println("pre-incremental operator- m value gets increased by 1 then the value of m is assigned to z");
		
		
		// post incremental operator- n value is assigned to y then the value of n is increased by 1
		int n = 5;
		int y = n++;
		System.out.println("post incremental value of n is:"+n);
		System.out.println("Post incremental value of y is:"+y);
		System.out.println("post incremental operator- n value is assigned to y then the value of n is increased by 1");
		
		//Decrement operator
		
		  //pre-decremental operator-value of a is decreased by 1 and the 'a' value is assigned to l
		int a = 20;
		int l = --a;
		System.out.println("pre deceremental value of a is:"+a);
		System.out.println("Pre decremental value of l is:"+l);
		System.out.println("pre-decremental operator-value of a is decreased by 1 and the 'a' value is assigned to l");
		
		
		 //post decremental operator-b value is assigned to q first then the value of 'b' is decreased by 1
		int b = 10;
		int q = b--;
		System.out.println("post decremental value of b is:"+b);
		System.out.println("Post decreemental value of q is:"+q);
		System.out.println("post decremental operator-b value is assigned to q first then the value of 'b' is decreased by 1");

	



	}

}
