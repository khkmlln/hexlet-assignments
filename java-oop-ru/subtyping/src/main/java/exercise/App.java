package exercise;

import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.Set;

// BEGIN
public class App {
    public static void swapKeyValue(KeyValueStorage storage) {
        Map<String, String> finale = storage.toMap();
        Set<Entry<String, String>> entries = finale.entrySet();
        entries.forEach(entry -> storage.unset(entry.getKey()));
        entries.forEach(entry -> storage.set(entry.getValue(), entry.getKey()));
        Map<String, String> swapped = finale.entrySet().stream()
                .collect(Collectors.toMap(Map.Entry::getValue, Map.Entry::getKey));
        storage.toMap().clear();
        for (Map.Entry<String, String> entry : swapped.entrySet()) {
            storage.set(entry.getKey(), entry.getValue());
        }
    }
}
// END
