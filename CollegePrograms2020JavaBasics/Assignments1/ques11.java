package Assignments1;

import java.util.Scanner;

public class ques11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myscanner = new Scanner(System.in);
		int a = myscanner.nextInt();
		int b = myscanner.nextInt();
		int c = myscanner.nextInt();
		
		System.out.println("Greatest of all 3 is: "+ Math.max(c, Math.max(a, b)));

	}

}
