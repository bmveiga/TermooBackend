package game;

import java.util.Set;

import words.Letters;
import wordsDb.readingWords;

public class Rules {
	

	public boolean testingIfWordIsValid(String word, Set<Letters> set) {
		boolean wordSize = word.length() == 5;
		boolean wordExists = new readingWords().containsWord(set, new Letters(word));
		boolean isValid = false;
		if (wordSize && wordExists) {
			isValid = true;
		}
		return isValid;
	}

	public boolean testingIfTheWordIsCorrect(String word, String wordRandom) {
		boolean isCorrect = false;
		if(word.equals(wordRandom)) {
			isCorrect = true;
		}
		return isCorrect;
	}
	
	public boolean checarPosicaoLetra(char word, char wordRandom) {
		boolean isCorrect = false;
		if(word == wordRandom) {
			isCorrect = true;
		}
		return isCorrect;
	}

	public boolean contemLetra(char word, String wordRandom) {
		boolean isCorrect = false;
		for (int i = 0; i < wordRandom.length(); i++) {
			if(word == wordRandom.charAt(i)) {
				return true;
			}
		}
		return isCorrect;
	}
	
	public String removerDoAlfabeto(String alfabeto, char letra) {
		int index = alfabeto.indexOf(letra);
		String alfabetoRestante = alfabeto;
		if(index == - 1) {
			return alfabetoRestante;
		}
		if(letra == 'a') {
			alfabetoRestante = "_" + alfabeto.substring(1);
		} else {
			alfabetoRestante = alfabeto.substring(0, index) + "_" + alfabeto.substring(index+1);
		}
		return alfabetoRestante;
	}
}
