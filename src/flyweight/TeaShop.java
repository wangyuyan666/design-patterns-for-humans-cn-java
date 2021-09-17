package flyweight;

import java.util.HashMap;
import java.util.Map;

public class TeaShop {
    final TeaMaker teaMaker;
    final Map<Integer, KarakTea> orders = new HashMap<>();

    public TeaShop(TeaMaker teaMaker) {
        this.teaMaker = teaMaker;
    }

    public void takeOrder(String teaType, int table) {
        orders.put(table, teaMaker.make(teaType));
    }

    public void serve() {
        for (Integer table : orders.keySet()) {
            System.out.println("Serving tea to table# " + table);
        }
    }
}
