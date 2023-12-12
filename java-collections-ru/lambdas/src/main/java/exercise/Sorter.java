package exercise;

import java.util.Comparator;
import java.util.Map;
import java.util.List;
import java.time.LocalDate;
import java.util.stream.Collectors;

// BEGIN
class Sorter {
    public static List<Map<String, String>> takeOldestMans(List<Map<String, String>> users) {
        return users.stream()
                .filter(user -> user.get("gender").equals("male"))
                .sorted(Comparator.comparing(user -> LocalDate.parse(user.get("birthday"))))
                .collect(Collectors.toList());
    }
}
// END
