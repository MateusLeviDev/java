package G_Interfaces.Polymorphism.Test;

import G_Interfaces.Polymorphism.domain.Notebook;
import G_Interfaces.Polymorphism.domain.Potato;

public class ProductTest01 {
    public static void main(String[] args) {
        Potato potato = new Potato("Mr. Potato Head", 10);
        Notebook notebook = new Notebook("ThinkPad", 400);
        System.out.println(potato.taxCalculate());
        System.out.println(notebook.taxCalculate());
        System.out.println("-------------------Calculating-------");
    }
}
