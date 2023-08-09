package ExercisesInternJava;

import java.util.Optional;

abstract class Animal {
    public abstract void makeSound();
}

class Dog extends Animal {

    @Override
    public void makeSound() {
        System.out.println("15161513116");
    }
}

class Cat extends Animal {

    @Override
    public void makeSound() {
        System.out.println("behbdhabhdbcd");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Optional<Animal> dog = Optional.of(new Dog());
        Optional<Cat> cat = Optional.of(new Cat());

        makeSound(dog);
        makeSound(cat);
    }

    public static void makeSound(Optional<? extends Animal> animal) {
        animal.isPresent();
    }
}
