package wordsDb;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import words.Letters;

public class readingWords {
	
	private final static String PATH = "db.csv";
	

	public Set<Letters> readFile() {
		Set<Letters> set = new HashSet<>();
		try (BufferedReader br = new BufferedReader(new FileReader(PATH))){
			String line = br.readLine();
			while(line != null) {
				set.add(new Letters(line));
				line = br.readLine();
			}
		}catch(IOException e ) {
			System.out.println("Error reading the file: " + e.getMessage());
		} finally {
			return set;		
		}
		
	}
	
	public boolean containsWord(Set set, Letters word) {
		boolean contains = false;
		if(set.contains(word)) {
			contains= true;
		}
		return contains;
	}
}
