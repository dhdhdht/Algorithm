package baek;

import java.util.Scanner;

public class Star1 {
	
	public static void main(String[] args) {
		//No. 2438
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		
		for(int i = 0; i < a; i ++ ) {
			for(int j = 0; j < i+1; j ++ ) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
