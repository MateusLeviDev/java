package G_Interfaces.Polymorphism.domain;

public class Potato extends Product {

    public Potato(String name, double price) {
        super(name, price);
    }

    @Override
    public double taxCalculate() {
        return this.price * 0.15;
    }
}
