package application;

import words.Letters;

public class UI {
	
		
		public static void printWord(Letters letter) {
			if(letter != null) {
				System.out.println(letter);
			} else {
				System.out.println("_");
			}
			System.out.println("");
		}
		
		public static Integer attempts() {
			int sum =+ 1;
			return sum;
		}
		
	

}
