package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
class App {
    public static Map<String, Integer> getWordCount(String sentence) {
        Map<String, Integer> wordCount = new HashMap<>();
        String[] letters = sentence.split(" ");
        for (var symbol : letters) {
            if (wordCount.containsKey(symbol)) {
                wordCount.put(symbol, wordCount.get(symbol) + 1);
            } else {
                wordCount.put(symbol, 1);
            }
        }
        return wordCount;
    }
    public static String toString(Map<String, Integer> wordCount) {
        if (wordCount.isEmpty()) {
            return "{}";
        }
        StringBuilder filtered = new StringBuilder();
        filtered.append("{\n");
        for (var word : wordCount.keySet()) {
            filtered.append("  ").append(word).append(": ").append(wordCount.get(word)).append("\n");
        }
        filtered.append("}");
        return filtered.toString();
    }
}
//END
