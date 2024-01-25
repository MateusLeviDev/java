package Polymorphism.composition.challenge;

public class CoffeeMaker {
    private boolean hasWorkToDo;

    public boolean isHasWorkToDo() {
        return hasWorkToDo;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void brewCoffee() {
        if (hasWorkToDo)
            System.out.println("Brew Coffee works!");

        hasWorkToDo = false;
    }
}
