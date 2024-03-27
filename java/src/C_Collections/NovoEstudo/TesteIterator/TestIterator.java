package C_Collections.NovoEstudo.TesteIterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class TestIterator {
    public static void main(String[] args) {
        FruitSupplier fruitSupplier = new FruitSupplier();
        Collection<String> fruits = fruitSupplier.getFruits();
        Iterator<String> iterator = fruits.iterator();
//        while (iterator.hasNext()) {
//            System.out.println("fruitStr: " + iterator.next());
//        }

        for (String fruit : fruits) {
            System.out.println("fruit = " + fruit);
        }
    }
}

class FruitSupplier {
    public Collection<String> getFruits() {

        return new ArrayList<>(List.of(
                "apple", "banana", "cherry"
        ));
    }
}
