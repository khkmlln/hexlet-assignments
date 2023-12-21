package exercise;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.Arrays;

// BEGIN
class App {
    public static String getForwardedVariables(String config) {
        if (config.isEmpty()) {
            return "";
        }
        List<String> env = Arrays.stream(config.split("\n"))
                .filter(line -> line.trim().startsWith("environment=\""))
                .map(line -> line.substring(line.indexOf("\"") + 1, line.length() - 1))
                .collect(Collectors.toList());
        Set<String> forwardedVars = env.stream()
                .flatMap(line -> Arrays.stream(line.split(",")))
                .filter(variable -> variable.startsWith("X_FORWARDED_"))
                .map(variable -> {
                    String[] pair = variable.split("=");
                    return pair[0].substring(13) + "=" + pair[1]; // измените эту часть
                })
                .collect(Collectors.toSet());
        return String.join(",", forwardedVars);
    }
}