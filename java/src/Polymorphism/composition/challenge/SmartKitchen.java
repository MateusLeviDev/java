package Polymorphism.composition.challenge;

public class SmartKitchen {

    private CoffeeMaker brewMaster;
    private DishWater dishWasher;
    private Refrigerator iceBox;

    public SmartKitchen() {
        brewMaster = new CoffeeMaker();
        dishWasher = new DishWater();
        iceBox = new Refrigerator();
    }

    public void addWater() {
        brewMaster.brewCoffee();
    }

    public static void main(String[] args) {
        SmartKitchen smartKitchen = new SmartKitchen();
        smartKitchen.brewMaster.setHasWorkToDo(true);
        smartKitchen.iceBox.setHasWorkToDo(true);
        smartKitchen.dishWasher.setHasWorkToDo(true);

        smartKitchen.brewMaster.brewCoffee();
        smartKitchen.dishWasher.doDishes();
        smartKitchen.iceBox.orderFood();
    }
}
