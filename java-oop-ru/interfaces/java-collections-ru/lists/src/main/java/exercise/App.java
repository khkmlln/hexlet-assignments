package exercise;

import java.util.ArrayList;
import java.util.List;

// BEGIN
class App {
	public static boolean scrabble(String sentence, String word) {
		List<Character> list = new ArrayList<>();
		for (var i : sentence.toLowerCase().toCharArray()) {
			list.add(i);
		}
		for (var j : word.toLowerCase().toCharArray()) {
			if (list.contains(j)) {
				list.remove(Character.valueOf(j));
			} else {
				return false;
			}
		}
		return true;
	}
}
//END
