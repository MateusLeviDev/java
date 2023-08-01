package J_Generics.test;

import java.util.List;

abstract class Animal {
    public abstract void consulta();
}

class Dog extends Animal {

    @Override
    public void consulta() {
        System.out.println("Consultando doguito.");
    }
}

class Cat extends Animal {

    @Override
    public void consulta() {
        System.out.println("Consultando gatito");
    }
}

public class WildCardTest01 {
    public static void main(String[] args) {
        List<Dog> dogs = List.of(new Dog(), new Dog());
        List<Cat> cats = List.of(new Cat(), new Cat());
        printConsulta(dogs);
        printConsulta(cats);
    }

    private static void printConsulta (List<? extends Animal> animals){
        for (Animal animal : animals) {
            animal.consulta();
        }
    }
}
