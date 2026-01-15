package software.ulpgc.kata3.viewModel;

import java.util.HashMap;
import java.util.Map;

public class Histogram {
    private final Map<Integer, Integer> map;

    public Histogram() {
        this.map = new HashMap<>();
    }

    public void put(int bin) {
        map.put(bin, count(bin)+1);
    }

    private int count(int bin) {
        return map.getOrDefault(bin, 0);
    }
}
