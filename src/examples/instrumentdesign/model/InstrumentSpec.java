package examples.instrumentdesign.model;

import examples.instrumentdesign.enums.Builder;
import examples.instrumentdesign.enums.Type;
import examples.instrumentdesign.enums.Wood;

import java.util.Objects;

public abstract class InstrumentSpec {

    private final String model;
    private final Builder builder;

    private final Wood topWood;
    private final Wood backWood;

    private final Type type;

    protected InstrumentSpec(String model, Builder builder, Wood topWood, Wood backWood, Type type) {
        this.model = model;
        this.builder = builder;
        this.topWood = topWood;
        this.backWood = backWood;
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InstrumentSpec that = (InstrumentSpec) o;
        return Objects.equals(model, that.model) && builder == that.builder && topWood == that.topWood && backWood == that.backWood && type == that.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, builder, topWood, backWood, type);
    }
}
