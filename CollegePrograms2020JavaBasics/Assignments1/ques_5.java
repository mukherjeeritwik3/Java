package Assignments1;

import java.util.Scanner;

class hexDecConverter{
	
	static int getDecimal(String a) {
		
		char charArr[] = a.toCharArray();
		int size = a.length();
		int power = a.length()-1;
		int result=0;
		
		for(int i=0;i<size;i++) {
			
			switch(charArr[i]) {
			
			case '0':
				power--;
				continue;
			case '1':
				result+= Math.pow(16, power)*1;
				power--;
				continue;
			case '2':
				result+= Math.pow(16, power)*2;
				power--;
				continue;
			case '3':
				result+= Math.pow(16, power)*3;
				power--;
				continue;
			case '4':
				result+= Math.pow(16, power)*4;
				power--;
				continue;
			case '5':
				result+= Math.pow(16, power)*5;
				power--;
				continue;
			case '6':
				result+= Math.pow(16, power)*6;
				power--;
				continue;
			case '7':
				result+= Math.pow(16, power)*7;
				power--;
				continue;
			case '8':
				result+= Math.pow(16, power)*8;
				power--;
				continue;
			case '9':
				result+= Math.pow(16, power)*9;
				power--;
				continue;
			case 'A':
				result+= Math.pow(16, power)*10;
				power--;
				continue;
			case 'B':
				result+= Math.pow(16, power)*11;
				power--;
				continue;
			case 'C':
				result+= Math.pow(16, power)*12;
				power--;
				continue;
			case 'D':
				result+= Math.pow(16, power)*13;
				power--;
				continue;
			case 'E':
				result+= Math.pow(16, power)*14;
				power--;
				continue;
			case 'F':
				result+= Math.pow(16, power)*15;
				power--;
				continue;	
			}
			
		}
		return result;
	}
}
public class ques_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner newScanner = new Scanner(System.in);
		String a;
		a = newScanner.next();
		
		System.out.println(hexDecConverter.getDecimal(a));
		
		

	}

}
