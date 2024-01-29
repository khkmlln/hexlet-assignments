package exercise;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Map.Entry;

// BEGIN
class App {
        public static List<Map<String, String>> findWhere(List<Map<String, String>> books, Map<String,String> dictionary) {
                List<Map<String, String>> finale = new ArrayList<>();
                for (var book : books) {
                        boolean matched = true;
                        for (Entry<String, String> entry : dictionary.entrySet()) {
                                String key = entry.getKey();
                                String value = entry.getValue();
                                String bookKey = book.get(key);
                                if (!value.equals(bookKey)) {
                                        matched = false;
                                        break;
                                }
                        }
                        if (matched) {
                                finale.add(book);
                        }
                }
                return finale;
        }
}
//END
