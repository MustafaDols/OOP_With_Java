package ch9;

public class TestBackpack {
    public static void main(String[] args) {


        Backpack backpack1 = new Backpack();


        backpack1.setOn(true);
        backpack1.putElements(1, 7);


        int elementsInPocket2 = backpack1.getElements(1);
        System.out.println("Elements in pocket 2: " + elementsInPocket2);


        backpack1.setOn(false);
        backpack1.putElements(0, 2);


        Backpack backpack2 = new Backpack("White", 88.0, 4);


        backpack2.setOn(true);
        backpack2.putElements(2, 3);


        backpack2.putElements(2, 2);


        int elementsInPocket3 = backpack2.getElements(2);
        System.out.println("Elements in pocket 3: " + elementsInPocket3);


        System.out.println("Number of backpack objects created: " + Backpack.getNoOfBackpacks());
    }
}
