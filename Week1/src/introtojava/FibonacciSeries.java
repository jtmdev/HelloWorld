package introtojava;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number- ");
		int n = scan.nextInt();
		int i = 34, firstNum = 0, secondNum = 1;	
	    
	    while (firstNum <= i) {
	      System.out.print(firstNum + " ");

	      int nextNum = firstNum + secondNum;
	      firstNum = secondNum;
	      secondNum = nextNum;
	      
	    }
	  }
	}
