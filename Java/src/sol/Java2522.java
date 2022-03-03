package sol;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Java2522 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			for(int j = T-1-i; j > 0; j--) {
				System.out.print(" ");
			}
			
			for(int k = 0; k < i+1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i = 0; i < T-1; i++) {
			for(int j = 0; j < i+1; j++) {
				System.out.print(" ");
			}
			
			for(int k = T-1-i; k > 0; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
