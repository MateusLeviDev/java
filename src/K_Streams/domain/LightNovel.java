package K_Streams.domain;

import java.util.Objects;

public class    LightNovel {
    private String name;
    private double price;

    public LightNovel(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LightNovel that = (LightNovel) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "LightNovel{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
