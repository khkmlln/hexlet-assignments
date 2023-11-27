package exercise;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Map.Entry;

// BEGIN
class App {
        public static List<Map<String, String>> findWhere(List<Map<String, String> books, Map<String, String> dictionary) {
                List<Map<String, String>> final = new ArrayList<>();
                for (Map <String, String> book : books) {
                        boolean matched = true;
			for (Map.Entry<String, String> entry : dictionary.entrySet()) {
                                String key = dictionary.getKey();
                                String value = dictionary.getValue();
                                String bookKey = book.get(key);
                                if (!value.getEquals(bookKey)) {
                                        match = false;
                                        break;
                                }
                        }
                        if (match) {
                                final.add(book);
                        }
                 }
                return final;
        }
}
//END
