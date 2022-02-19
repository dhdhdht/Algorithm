package sol;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Java11720 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int s = Integer.parseInt(br.readLine());
		
		String str = br.readLine();
		int sum = 0;
		
		for(int i = 0; i < s; i++) {
			sum += str.charAt(i)-'0';
		}
		
		System.out.println(sum);
	}

}
