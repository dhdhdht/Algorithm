package sol;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Java2442 {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			for(int j = 1; j < T-i; j++) {
				System.out.print(" ");
			}
			
			for(int k = 0; k < (2*i)+1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
