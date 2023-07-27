package G_Interfaces.Polymorphism.Test;

import G_Interfaces.Polymorphism.domain.Notebook;
import G_Interfaces.Polymorphism.domain.Potato;
import G_Interfaces.Polymorphism.domain.Product;
import G_Interfaces.Polymorphism.service.TaxCalculator;

public class ProductTest2 {
    public static void main(String[] args) {
        Product p1 = new Potato("Potato Red", 10);
        Product p2 = new Notebook("Dell", 1000);
        System.out.println(p1.getName());
        System.out.println(p1.getPrice());
        System.out.println(p1.taxCalculate());
        System.out.println("----=---==-=------=---------=-=------=");

        System.out.println(p2.getName());
        System.out.println(p2.getPrice());
        System.out.println(p2.taxCalculate());
    }
}
