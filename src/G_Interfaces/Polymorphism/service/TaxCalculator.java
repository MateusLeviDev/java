package G_Interfaces.Polymorphism.service;

import G_Interfaces.Polymorphism.domain.Product;

public class TaxCalculator {
    public static void taxCalculator(Product product) {
        System.out.println("----- STARTING _______");
        double taxCalculate = product.taxCalculate();
        System.out.println("Name: " + product.getName());
        System.out.println("Price: " + product.getPrice());
        System.out.println("Tax: " + product.taxCalculate());
    }
}
