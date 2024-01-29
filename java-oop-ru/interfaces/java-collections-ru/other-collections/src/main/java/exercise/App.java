package exercise;

import java.util.*;

// BEGIN
class App {
    public static Map<String, String> genDiff(Map<String, Object> data, Map<String, Object> data1) {
            Map<String, String> result = new LinkedHashMap<>();
            for (String key : data.keySet()) {
                if (data1.containsKey(key)) {
                    Object value1 = data.get(key);
                    Object value2 = data1.get(key);
                    if (value1.equals(value2)) {
                        result.put(key, "unchanged");
                    } else {
                        result.put(key, "changed");
                    }
                } else {
                    result.put(key, "deleted");
                }
            }
            for (String key1 : data1.keySet()) {
                if (!data.containsKey(key1)) {
                    result.put(key1, "added");
                }
            }
            Map<String, String> sortedR = new LinkedHashMap<>();
            result.entrySet().stream()
                    .sorted(Map.Entry.comparingByKey())
                    .forEachOrdered(y -> sortedR.put(y.getKey(), y.getValue()));
            return sortedR;
        }
    }