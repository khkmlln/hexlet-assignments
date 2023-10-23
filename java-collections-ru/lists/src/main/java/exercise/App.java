package exercise;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

// BEGIN
public class App {
public static boolean scrabble(String letters, String word) {
	List<Character> list = new ArrayList<>();
	String lettersLowerCase = letters.toLowerCase();
	for (char words: lettersLowerCase.toCharArray()) {
		list.add(words);
	}
	for (char words: word.toLowerCase().toCharArray()) {	
	if (list.contains(words)) {
			list.remove(Character.valueOf(words));
		} else {
			return false;
	}
}
return true;
}
}


//END
