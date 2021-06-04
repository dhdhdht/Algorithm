package baek;

import java.util.Scanner;

public class Word {
	
	public static void main(String[] args) {
		//No.1157
		Scanner sc = new Scanner(System.in);
		
		int[] a = new int[26];
		String s = sc.nextLine().toUpperCase();
		int max = 0;
		char c = 'a';
		
		//ascii 65-90
		for(int i =0; i < s.length(); i++) {
			a[s.charAt(i) - 65]++;
			if (max < a[s.charAt(i) - 65]) {
				max = a[s.charAt(i) - 65];
				c = s.charAt(i);
			} else if(max == a[s.charAt(i) - 65]){
				c = '?';
			}
			
		}
		System.out.println(c);
		
	}

}
