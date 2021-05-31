package baek;

import java.util.Scanner;

public class Clock {
	
	public static void main(String[] args) {
		//No. 2884
		
		//0 <= H <= 23
		//0 <= M <= 59
		Scanner sc = new Scanner(System.in);
		
		int H = sc.nextInt();	//10, 0, 23
		int M = sc.nextInt();	//10, 30, 40
		if((M - 45) < 0) {
			if((H -1) < 0) {
				H = - 1 + 24;
				M = M - 45 + 60;
			} else {
				H -= 1;
				M = M - 45 + 60;
			}
			
		} else {
			M = M - 45;
		}
		
		System.out.print(H + " " + M);
		
	}
}
