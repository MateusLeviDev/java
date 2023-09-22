package A1_JavaStreamExercises.aulas;

import A1_JavaStreamExercises.aulas.domain.Product;

import java.util.ArrayList;
import java.util.List;

public class ExProductStream {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>(List.of(
                new Product(1, "iPhone", 2000, 10),
                new Product(2, "PC", 1000, 5),
                new Product(3, "Car", 10000, 2),
                new Product(4, "House", 20000, 4),
                new Product(5, "Macbook", 1500, 5)
        ));

        //TODO

    }
}
