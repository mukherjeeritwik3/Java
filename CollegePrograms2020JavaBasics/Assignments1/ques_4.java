package Assignments1;


public class ques_4 {
	public static int binaryDec(int binary) {
		
		return binary;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner newScanner = new java.util.Scanner(System.in);
		String a ;
		a= newScanner.next();
		char b[] = a.toCharArray();
		int result=0;
		int size = a.length();
		int power = a.length()-1;
		for(int i=0;i<size;i++) {
			
			if (b[i]=='1') {
				result+= Math.pow(2,power)*1;
				power--;
			}
			else {
				power--;
			}
		}
		System.out.println(result);
		

	}

}
