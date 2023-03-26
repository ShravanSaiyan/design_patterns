package examples.instrumentdesign.model;

import examples.instrumentdesign.enums.Builder;
import examples.instrumentdesign.enums.Type;
import examples.instrumentdesign.enums.Wood;

import java.util.Objects;

public class GuitarSpec extends InstrumentSpec {

    private final String numOfStrings;

    public GuitarSpec(String model, Builder builder, Wood topWood, Wood backWood, Type type, String numOfStrings) {
        super(model, builder, topWood, backWood, type);
        this.numOfStrings = numOfStrings;
    }

    public String getNumOfStrings() {
        return numOfStrings;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        GuitarSpec that = (GuitarSpec) o;
        return Objects.equals(numOfStrings, that.numOfStrings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numOfStrings);
    }
}
