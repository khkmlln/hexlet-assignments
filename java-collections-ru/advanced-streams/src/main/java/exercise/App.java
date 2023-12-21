package exercise;

import java.util.HashSet;
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
                .filter(line -> line.startsWith("environment=\""))
                .collect(Collectors.toList());
        Set<String> varieties = new HashSet<>();
        for (String line : env) {
            String variety = line.substring(line.indexOf("\"") + 1, line.lastIndexOf("\""));
            varieties.addAll(Arrays.stream(variety.split(","))
                    .filter(variable -> variable.startsWith("X_FORWARDED_"))
                    .map(variable -> variable.replace("X_FORWARDED_", ""))
                    .collect(Collectors.toList()));
        }
        return varieties.stream()
                .map(variable -> {    String value = System.getenv("X_FORWARDED_" + variable);    return variable + "=" + (value != null ? value : ""); })
                .collect(Collectors.joining(","));
    }
}
//END
