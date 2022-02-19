package sol;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Java10818 {
	public static void main(String[] args) throws Exception {
		//sol 1
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int x = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//		int[] arr = new int[x];
//		int index = 0;
//		while(st.hasMoreTokens()) {
//			arr[index] = Integer.parseInt(st.nextToken());
//			index++;
//		}
//		
//		Arrays.sort(arr);
//		System.out.println(arr[0] + " " + arr[x-1]);
		
		//sol 2
		int max = -1000000;
		int min = 1000000;
		while(st.hasMoreTokens()) {
			int val = Integer.parseInt(st.nextToken());
			if(val > max) {
				max = val;
				System.out.println("max : " + max);
			}
			if(val < min) {
				min = val;
				System.out.println("min : " + min);
			}
		}
		System.out.println(min + " " + max);
	}

}
