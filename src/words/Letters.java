package words;

import java.util.Objects;

public class Letters {
	
	private String word;

	public Letters(String word) {
		this.word = word;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	@Override
	public int hashCode() {
		return Objects.hash(word);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Letters other = (Letters) obj;
		return Objects.equals(word, other.word);
	}

	@Override
	public String toString() {
		return "Letters [word=" + word + "]";
	}
	
	

}
