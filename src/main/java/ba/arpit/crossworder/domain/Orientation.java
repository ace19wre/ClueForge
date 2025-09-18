package ba.arpit.crossworder.domain;

import java.util.Objects;

public class Orientation {

    public static final Orientation ACROSS = new Orientation("ACROSS");
    public static final Orientation DOWN = new Orientation("DOWN");

    private final String name;

    private Orientation(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Orientation that = (Orientation) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

}
