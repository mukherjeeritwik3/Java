package Assignments1;

import java.util.Scanner;

public class ques_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myScanner = new Scanner(System.in);
		int input = myScanner.nextInt();
		String mystr = new String();
		mystr ="";
		
		while(input!=1) {
			int temp = input%2;
			input=input/2;
			mystr = mystr+ Integer.toString(temp);
			
			
		}
		mystr+="1";
		StringBuffer reversestr = new StringBuffer();
		reversestr.append(mystr);
		reversestr = reversestr.reverse();
		System.out.println(reversestr);
		int zeroBits = 0;
		char charString[]= reversestr.toString().toCharArray();
		for(int i=0; i<charString.length;i++) {
			if(charString[i]=='0') {
				zeroBits+=1;
			}
		}
		System.out.println(zeroBits);

	}

}
