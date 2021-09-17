package flyweight;

import java.util.HashMap;
import java.util.Map;
// Acts as a factory and saves the tea
public class TeaMaker {
    private Map<String, KarakTea> availableTea = new HashMap<>();

    public KarakTea make(String teaType) {
        KarakTea tea = availableTea.get(teaType);
        if (tea == null) {
            tea = new KarakTea();
            availableTea.put(teaType, tea);
        }
        return tea;
    }

}
