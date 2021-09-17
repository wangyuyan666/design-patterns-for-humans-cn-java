package iterator;

import java.util.Objects;

public class RadioStation {
    private final float frequency;

    public RadioStation(float frequency) {
        this.frequency = frequency;
    }

    public float getFrequency() {
        return frequency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RadioStation that = (RadioStation) o;
        return Float.compare(that.frequency, frequency) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(frequency);
    }
}
