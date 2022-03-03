package sol;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Java2445 {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			for(int j = 0; j < i+1; j++) {
				System.out.print("*");
			}
			
			for(int k = 2*T-2*(i+1); k > 0; k--) {
				System.out.print(" ");
			}
			
			for(int h = 0; h < i+1; h++) {
				System.out.print("*");
			}
			System.out.println();			
		}
		
		for(int i = 0; i < T-1; i++) {
			for(int j = T-i-1; j > 0; j--) {
				System.out.print("*");
			}
			
			for(int k = 0; k < 2*i+2; k++) {
				System.out.print(" ");
			}
			
			for(int h = T-i-1; h > 0; h--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
