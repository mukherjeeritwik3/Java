package Assignments1;

import java.util.Scanner;


public class ques_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myscanner = new Scanner(System.in);
		int a = myscanner.nextInt();
		int b = myscanner.nextInt();
		
		System.out.println("Sum of two Integers: "+(a+b));
		System.out.println("Difference of two Integers: "+(a-b));
		System.out.println("Product of two Integers: "+(a*b));
		System.out.println("Average of two numbers: "+((a+b)/2.0));
		System.out.println("Distance between two numbers: "+(Math.abs((a-b))));
		System.out.println("MAX of two Integers: "+(Math.max(a, b)));
		System.out.println("MIN of two Integers: "+(Math.min(a, b)));
	}

}
