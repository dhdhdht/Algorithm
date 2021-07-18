package Baek;

import java.util.Scanner;

public class WordCount {
	
	public static void main(String[] args) {
		//No. 1152
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine().trim();
		if (s.isEmpty()) {
			System.out.println(0);
		} else {
			System.out.println(s.split(" ").length);
		}
	}

}
