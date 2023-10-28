package Collections.Test;

import Collections.Domain.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class SmartphoneListTest01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1ABC", "iPhone");
        Smartphone s2 = new Smartphone("2ABC", "Pixel");
        Smartphone s3 = new Smartphone("3ABC", "Sansung");

        List<Smartphone> smartphones = new ArrayList<>(6); //trabalhando com objetos. criando uma lista de smartphones
        smartphones.add(s1);
        smartphones.add(s2); //collections
        smartphones.add(s3);

        System.out.println(smartphones.toString());

        for (Smartphone smartphone : smartphones) { //smartphone irá percorrer a coleção smartphones e imprimirá os valores
            System.out.println(smartphone); //Java chamará implicitamente o método toString() do objeto, caso implementado
        }

        Smartphone s4 = new Smartphone("2ABC", "Pixel");
        System.out.println(smartphones.contains(s4));
        int indexSmartphone4 = smartphones.indexOf(s4);
        System.out.println(smartphones.get(indexSmartphone4));
    }
}
