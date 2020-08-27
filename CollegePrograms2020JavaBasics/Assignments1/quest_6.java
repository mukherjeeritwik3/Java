package Assignments1;

public class quest_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a [][] = {{10,20,30},{40,50,60}};
		
		System.out.println("Original Array");
		for (int i =0; i<2;i++) {
			for(int j =0; j<3;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Changed MAtrix");
		for(int i = 0 ; i<3;i++ ) {
			for(int j = 0;j<2;j++) {
				System.out.print(a[j][i]+ " ");
			}
			System.out.println();;
		}

	}

}
