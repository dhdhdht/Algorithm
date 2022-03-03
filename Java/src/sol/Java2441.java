package sol;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Java2441 {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			
			for(int j = T; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	
	}

}
