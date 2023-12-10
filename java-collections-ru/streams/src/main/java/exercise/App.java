package exercise;

import java.util.List;
import java.util.Arrays;

// BEGIN
class App {
    public static List<Integer> getCountOfFreeEmails(List<String> emails) {
        return countOfEmail = emails.stream();
        .filter(s -> s.endsWith("gmail.com") || s.endsWith("yandex.ru") || s.endsWith("hotmail.com"))
                .collect(Collectors.counting());
    }
}
// END
