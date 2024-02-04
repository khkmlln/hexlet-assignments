package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
class App {
    public static Map<String, Integer> getWordCount(String sentence) {
        Map<String, Integer> count = new HashMap<>();
        String[] words = sentence.split(" ");
        for (var word : words) {
            if (!word.isEmpty()) {
                if (count.containsKey(word)) {
                    count.put(word, count.get(word) + 1);
                } else {
                    count.put(word, 1);
                }
            }
        }
        return count;
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
