package exercise;
import java.util.HashMap;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import com.fasterxml.jackson.databind.ObjectMapper;

class FileKVTest {
    private static Path filepath = Paths.get("src/test/resources/file").toAbsolutePath().normalize();

    @BeforeEach
    public void beforeEach() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String content = mapper.writeValueAsString(new HashMap<String, String>());
        Files.writeString(filepath, content, StandardOpenOption.CREATE);
    }

    @Test
    public void testSet() {
        FileKV kv = new FileKV(filepath.toString(), new HashMap<>());
        kv.set("key1", "value1");
        kv.set("key2", "value2");

        // Assert that the values were set correctly
        assert kv.get("key1", null).equals("value1");
        assert kv.get("key2", null).equals("value2");
    }

    @Test
    public void testUnset() {
        FileKV kv = new FileKV(filepath.toString(), new HashMap<>());
        kv.set("key1", "value1");
        kv.set("key2", "value2");

        kv.unset("key1");

        // Assert that the key was unset
        assert kv.get("key1", null) == null;
        // Assert that the other key still exists
        assert kv.get("key2", null).equals("value2");
    }

    @Test
    public void testGetWithDefaultValue() {
        FileKV kv = new FileKV(filepath.toString(), new HashMap<>());
        kv.set("key1", "value1");

        // Assert that the existing key is retrieved
        assert kv.get("key1", null).equals("value1");
        // Assert that a non-existing key returns the default value
        assert kv.get("key2", "default").equals("default");
    }

    @Test
    public void testToMap() {
        HashMap<String, String> initialData = new HashMap<>();
        initialData.put("key1", "value1");
        initialData.put("key2", "value2");

        FileKV kv = new FileKV(filepath.toString(), initialData);

        // Assert that the map returned by toMap() matches the initial data
        assert kv.toMap().equals(initialData);
    }
}
