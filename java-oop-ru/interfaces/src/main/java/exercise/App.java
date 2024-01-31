package exercise;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// BEGIN
class App {
    public static List<String> buildApartmentsList(List<Home> h, int n) {
        h.sort(Comparator.comparingDouble(Home::getArea));
        List<String> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (i >= h.size()) {
                break;
            }
            Home home = h.get(i);
            result.add(home.toString());
        }
        return result;
    }
}
// END