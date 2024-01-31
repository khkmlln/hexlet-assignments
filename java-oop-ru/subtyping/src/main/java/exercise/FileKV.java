package exercise;

// BEGIN
import java.util.Map;
import java.nio.file.Path;
import java.util.HashMap;

public class FileKV implements  KeyValueStorage {
    private final Path filePath;
    private final Map<String, String> data;
    public FileKV(String filePath, Map<String, String> initialData) {
        this.filePath = Path.of(filePath);
        this.data = new HashMap<>(initialData);
        Utils.writeFile(filePath, Utils.serialize(initialData));
    }

    @Override
    public void set(String key, String value) {
        data.put(key, value);
        Utils.writeFile(filePath.toString(), Utils.serialize(data));
    }

    @Override
    public void unset(String key) {
        data.remove(key);
        Utils.writeFile(filePath.toString(), Utils.serialize(data));
    }

    @Override
    public String get(String key, String defaultValue) {
        return data.getOrDefault(key, defaultValue);
    }

    @Override
    public Map<String, String> toMap() {
        return new HashMap<>(data);
    }
}

// END
