package Assignments1;

import java.util.Scanner;

public class ques9 {
	public static void main(String[] args) {
		
		Scanner myscanner = new Scanner(System.in);
		long a = myscanner.nextInt();
		long min_inYear = 60*24*365;
		long years = a/min_inYear;
		long days = (a/60/24)%365;
		System.out.println(a+" minutes is approximately "+years+" years and "+days+" days");
	}

}
