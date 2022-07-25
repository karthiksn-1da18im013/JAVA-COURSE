package javaBasics;

public class Fibonnociseries {

public static void main(String[] args) {
		
		//To do Fibbanocci 30 numbers or n numbers series calculation
		
				int num = 30, firstnum = 0, secondnum = 1;
				System.out.println("Fibonacci Series till " + num+ "terms:");
				for (int i= 1; i<=num; ++i) {
					System.out.print(firstnum + secondnum+ ",");
					int nextnum = firstnum + secondnum;
					firstnum = secondnum;
					secondnum = nextnum;
					
					
				}

	}

}
