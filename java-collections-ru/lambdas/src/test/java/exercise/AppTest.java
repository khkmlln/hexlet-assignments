package exercise;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

// BEGIN
class AppTest {
    @Test
    void testEnlargeArrayImage() {
        String[][] array = {{"A", "B"}, {"C", "D"}};
        String[][] result = App.enlargeArrayImage(array);
        assertThat(result.length).isEqualTo(4);
        assertThat(result[0].length).isEqualTo(4);
        assertThat(result[0][0]).isEqualTo("A");
        assertThat(result[0][1]).isEqualTo("A");
        assertThat(result[1][0]).isEqualTo("A");
        assertThat(result[1][1]).isEqualTo("A");
        assertThat(result[0][2]).isEqualTo("B");
        assertThat(result[0][3]).isEqualTo("B");
        assertThat(result[1][2]).isEqualTo("B");
        assertThat(result[1][3]).isEqualTo("B");
        assertThat(result[2][0]).isEqualTo("C");
        assertThat(result[2][1]).isEqualTo("C");
        assertThat(result[3][0]).isEqualTo("C");
        assertThat(result[3][1]).isEqualTo("C");
        assertThat(result[2][2]).isEqualTo("D");
        assertThat(result[2][3]).isEqualTo("D");
        assertThat(result[3][2]).isEqualTo("D");
        assertThat(result[3][3]).isEqualTo("D");
    }
}
// END
