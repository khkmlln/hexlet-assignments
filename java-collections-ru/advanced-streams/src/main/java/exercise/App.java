package exercise;


import java.util.stream.Collectors;
import java.util.Arrays;

// BEGIN
class App {
    public static String getForwardedVariables(String config) {
        if (config.isEmpty()) {
            return "";
        }
        String[] lines = config.split("\n"); // делаем сплит чтобы каждая строка была элементом массива
        return Arrays.stream(lines)
                .filter(line -> line.startsWith("environment=\"")) // фильтруем все строки начинающиея с "environment="
                .map(line -> line.replaceAll("environment=\"\"", "")) // затем удаляем из строки ненужные нам "environment=""
                .map(line -> line.replaceAll("\"\"", "")) // не забывем удалить лишне ковычки
                .map(line -> line.split(",")) // то что у нас осталось нужно опять разделить через split по запятой
                .flatMap(Arrays::stream) // т.к резульат split это массив, надо его превратить в стрим, делаем как в начале Arrays.stream
                .filter(kv -> kv.startsWith("X_FORWARDED_") ) // фильтруем те элемены которые начинаются с "X_FORWARDED_"
                .map(kv -> kv.replaceAll("X_FORWARDED_", "\"\"")) // затем удаляем из строки ненужные нам "X_FORWARDED_ для удаления используем replaceAll("ЧТО УДАЛЯЕМ", "")// пустая строка так мы типа заменяем строку на ничто тем самым удаляем
    .collect(Collectors.joining(",")); // собираем все в List строку с элементами разделенными через запяту/
    }
}