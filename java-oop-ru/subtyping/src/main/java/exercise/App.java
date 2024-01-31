package exercise;

import java.util.Map;
import java.util.Map.Entry;

// BEGIN
public class App {
    public static void swapKeyValue(KeyValueStorage storage) {
        Map<String, String> finale = storage.toMap();
        storage.toMap().clear();
        for (Entry<String, String> entry : finale.entrySet()) {
            finale.put(entry.getValue(), entry.getKey());
        }
    }
}
// END
