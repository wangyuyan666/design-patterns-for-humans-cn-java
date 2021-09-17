package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StationList implements Iterator<RadioStation> {

    private List<RadioStation> stations = new ArrayList<>();

    private int count;

    public void addStation(RadioStation station) {
        stations.add(station);
    }

    public void removeStation(RadioStation station) {
        stations.remove(station);
    }

    @Override
    public boolean hasNext() {
        return stations.size() > count;
    }

    @Override
    public RadioStation next() {
        if (hasNext()) {
            return stations.get(count++);
        }
        return null;
    }
}
