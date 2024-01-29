package exercise;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void testTake() {
        List<Integer> number1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        List<Integer> result = App.take(number1, 2);
        assertThat(result).containsExactly(1, 2);
        List<Integer> number2 = new ArrayList<>(Arrays.asList(7, 10, 1));
        List<Integer> result2 = App.take(number2, 9);
        assertThat(result2).containsExactly(7, 10, 1);
    }
}
