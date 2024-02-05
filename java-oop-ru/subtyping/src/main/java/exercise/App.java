package exercise;

import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

// BEGIN
public class App {
    public static void swapKeyValue(KeyValueStorage storage) {
        Map<String, String> finale = storage.toMap();
        Map<String, String> swapped = finale.entrySet().stream()
                .collect(Collectors.toMap(Map.Entry::getValue, Map.Entry::getKey));
        storage.toMap().clear();
        for (Map.Entry<String, String> entry : swapped.entrySet()) {
            storage.set(entry.getKey(), entry.getValue());
        }
    }
}
// END
