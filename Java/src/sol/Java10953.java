package sol;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Java10953 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		String str = "";
		
		int T = Integer.parseInt(br.readLine());
		for(int i = 0; i < T; i++) {
			str = br.readLine();
			st = new StringTokenizer(str, ",");
			
			int x,y;
			x = Integer.parseInt(st.nextToken());
			y = Integer.parseInt(st.nextToken());
			
			System.out.println(x + y);
		}
		
	}
}
