package examples.instrumentdesign.model;

import examples.instrumentdesign.enums.Builder;
import examples.instrumentdesign.enums.Style;
import examples.instrumentdesign.enums.Type;
import examples.instrumentdesign.enums.Wood;

import java.util.Objects;

public class MandolinSpec extends InstrumentSpec {

    private final Style style;

    public MandolinSpec(String model, Builder builder, Wood topWood, Wood backWood, Type type, Style style) {
        super(model, builder, topWood, backWood, type);
        this.style = style;
    }

    public Style getStyle() {
        return style;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        MandolinSpec that = (MandolinSpec) o;
        return Objects.equals(style, that.style);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), style);
    }
}
