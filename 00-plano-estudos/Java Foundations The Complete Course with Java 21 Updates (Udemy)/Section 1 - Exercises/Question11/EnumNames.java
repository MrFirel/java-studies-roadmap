import java.util.HashMap;
import java.util.Map;

public class EnumNames {
    private Map<Integer, String> names = Map.of(
            1, "Alice",
            2, "Bruno",
            3, "Carla"
    );

    public Map<Integer, String> getNames() {
        return names;
    }
}
