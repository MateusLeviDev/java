package C_Collections.Collections.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListaArrayConversaoTest01 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        Integer[] listToArray = numeros.toArray(new Integer[0]); //usando 0 o java utilizará reflection para descobrir o tamanho
        System.out.println(Arrays.toString(listToArray));
        System.out.println("===================================end");

        Integer[] numerosArray = new Integer[3];
        numerosArray[0] = 1;
        numerosArray[1] = 2;
        numerosArray[2] = 3;

        List<Integer> arrayToList = Arrays.asList(numerosArray); //asList cria um link com "numerosArray". tomar cuidado

        arrayToList.set(0,12);
        System.out.println(Arrays.toString(numerosArray));
        System.out.println(arrayToList);

        System.out.println("======================================end");
        System.out.println("======================================end");
        System.out.println("======================================end");
        List<Integer> numeroList = new ArrayList<>(Arrays.asList(numerosArray));
        numeroList.add(15);
        System.out.println(numeroList);

    }
}
