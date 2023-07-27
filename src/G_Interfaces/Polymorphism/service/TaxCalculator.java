package G_Interfaces.Polymorphism.service;

import G_Interfaces.Polymorphism.domain.Notebook;
import G_Interfaces.Polymorphism.domain.Potato;
import G_Interfaces.Polymorphism.domain.Product;

public class TaxCalculator {
    public static void notebookTaxCalculator(Notebook notebook) {
        System.out.println("Calculating: ");
        double tax = notebook.taxCalculate();
        System.out.println("Notebook: " + notebook.getName());
        System.out.println("Price: " + notebook.getPrice());
        System.out.println("Tax: " + tax);
    }

    public static void pomatoTaxCalculator(Potato potato) {
        System.out.println("Calculating");
        double tax = potato.taxCalculate();
        System.out.println("Potato: " + potato.getName());
        System.out.println("Price: " + potato.getPrice());
        System.out.println("Tax: " + tax);
    }

    public static void taxCalculator(Product product) {
        System.out.println("----- STARTING _______");
        double taxCalculate = product.taxCalculate();
        System.out.println("Name: " + product.getName());
        System.out.println("Price: " + product.getPrice());
    }
}
