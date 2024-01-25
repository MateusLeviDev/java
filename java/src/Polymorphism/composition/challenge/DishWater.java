package Polymorphism.composition.challenge;

public class DishWater {
    private boolean hasWorkToDo;

    public boolean isHasWorkToDo() {
        return hasWorkToDo;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void doDishes() {
        if (hasWorkToDo)
            System.out.println("Dish Water works!");

        hasWorkToDo = false;
    }
}