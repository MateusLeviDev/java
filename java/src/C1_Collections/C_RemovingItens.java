package C1_Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class C_RemovingItens {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>(List.of(
                "Banana", "Strawberry", "Apple"
        ));

        List<String> collect = fruits.stream()
                .filter(f -> !"Apple".equals(f))
                .collect(Collectors.toList());

        System.out.println(collect);

        boolean b = fruits.removeIf("Apple"::equals);

//		Iterator<String> fruitsIterator = fruits.iterator();
//		while(fruitsIterator.hasNext()) {
//			String fruit = fruitsIterator.next();
//			System.out.println(fruit);
//			if ("Apple".equals(fruit)) {
//				fruits.remove(fruit);
//			}
//		}

        for (int i = 0; i < fruits.size(); i++) {
            System.out.println(fruits.get(i));
            if ("Apple".equals(fruits.get(i))) {
                fruits.remove(i);
                i--;
            }
        }
    }

}
