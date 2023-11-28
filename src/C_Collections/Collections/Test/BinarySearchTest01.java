package C_Collections.Collections.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest01 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(4);
        numeros.add(5);
        numeros.add(7);
        numeros.add(0);
        numeros.add(1); //para a busca binária antes precisa que a lista esteja ordenada

        Collections.sort(numeros);
        System.out.println(Collections.binarySearch(numeros, -1));

    }
}
