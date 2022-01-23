package words;

import java.util.Scanner;
import java.util.Set;

import boardgame.Board;
import game.Rules;

public class Match {
	
	private String alfabeto = "a b c d e f g h i j k l m n o p q r s t u v w x y z ";
	
	public void match(int attempts, Set<Letters> set, String wordRandom) {
		Scanner sc = new Scanner(System.in);
		String usedLetters = alfabeto;
		boolean isTheCorrectWord = false;
		while(attempts < 6) {
			attempts ++;
			System.out.println("Tentativa " + attempts + "- Insira uma palavra de 5 letras: ");
			String word = sc.nextLine().toLowerCase();
			
			//System.out.println(isTheCorrectWord);
			boolean isValidWord = new Rules().testingIfWordIsValid(word, set);
			
			while(!isValidWord) {
				System.out.println("Insira uma palavra válida");
				word = sc.nextLine();
				isValidWord = new Rules().testingIfWordIsValid(word, set);
			}
			
			isTheCorrectWord = new Rules().testingIfTheWordIsCorrect(word, wordRandom);
			if(isTheCorrectWord) {
				System.out.println("Parabéns, você acertou a palavra na " + attempts +  "ª tentativa!");
				break;
			} else {
				
				StringBuilder sb = new StringBuilder();
				for (int i = 0; i < 5; i++) {
					boolean characterPosition = new Rules().checarPosicaoLetra(word.charAt(i), wordRandom.charAt(i));
					if (characterPosition) {
						sb.append(Character.toUpperCase(word.charAt(i)) + " ");
					} else {
						boolean containsChar = new Rules().contemLetra(word.charAt(i), wordRandom);
						if (containsChar) {
							System.out.println("A palavra contem a letra ''" + word.charAt(i) + "'' porém em outra posição");
							sb.append(" _ ");
						} else {
							sb.append(" _ ");
						}
					}
					usedLetters = new Rules().removerDoAlfabeto(alfabeto, word.charAt(i));
					alfabeto = usedLetters;
				}
				System.out.println(sb);
				System.out.println("Letras restantes: " + usedLetters.toUpperCase());
				
			}
		}
		if(!isTheCorrectWord) {
			System.out.println("Número máximo de tentativas atingido! Palavra correta: " + wordRandom);			
		}
		sc.close();
	}

}
