package G_Interfaces.Polymorphism.domain;

public class Notebook extends Product {

    public Notebook(String name, double price) {
        super(name, price);
    }

    @Override
    public double taxCalculate() {
        return this.price * 0.15;
    }
}
