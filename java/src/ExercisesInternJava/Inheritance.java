package ExercisesInternJava;

import java.util.Optional;

interface Animal {
    void makeSound();
}

class Dog implements Animal {

    @Override
    public void makeSound() {
        System.out.println("15161513116");
    }
}

class Cat implements Animal {

    @Override
    public void makeSound() {
        System.out.println("behbdhabhdbcd");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Optional<Dog> dog = Optional.of(new Dog());
        Optional<Cat> cat = Optional.of(new Cat());

        makeSound(dog);
        makeSound(cat);

        System.out.println(Sum(1,9));
    }

    public static int Sum(int a, int b) {
        return a + b;
    }

    /**Em Java, a covariância é aplicada principalmente em tipos genéricos e é importante para garantir a segurança de tipos ao trabalhar com herança e polimorfismo.
     * A covariância é mais notável ao trabalhar com arrays e coleções genéricas, como List, Set e Map.
     *
     * @Generics embora extends seja frequentemente associado à herança, nesse contexto, ele se
     * refere à relação de subtipo entre as classes e à capacidade de lidar com esses subtipos de forma genérica.
     * Isso faz parte da flexibilidade proporcionada pela tipagem genérica e pelas   interfaces em Java.
     */
    public static void makeSound(Optional<? extends Animal> animal) {
        animal.ifPresent(Animal::makeSound);
    }

}
