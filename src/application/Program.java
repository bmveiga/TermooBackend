package application;

import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

import game.Rules;
import words.Letters;
import words.Match;
import wordsDb.readingWords;

public class Program {

	public static void main(String[] args) {
		
		
		Random random = new Random();
		int intervaloRandom = random.nextInt(1000);
		
		Set<Letters> set = new readingWords().readFile();
		Object[] words = set.toArray();
		final Letters  wordRandom =  (Letters) words[intervaloRandom];
		
		new Match().match(0, set, wordRandom.getWord());
				
	}

}
