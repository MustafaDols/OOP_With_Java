package ch9;

import ch9.Fridge;

public class TestFridge {
    public static void main(String[] args) {
        Fridge fridge1 = new Fridge();
        fridge1.setOn(true);
        fridge1.addMeal(5,2);
        System.out.println(fridge1.getMeal(5));
        fridge1.setOn(false);
        fridge1.addMeal(1, 2);
        Fridge fridge2 = new Fridge(4,90,"yellow");
        fridge2.setOn(true);
        fridge2.addMeal(3,3);
        fridge2.addMeal(3,2);
        System.out.println(fridge2.getMeal(3));
        System.out.println(Fridge.getNoOfFridges());
    }
}
