package ch9;

public class Fridge {
    private String color= "gray";
    private double size = 50;
    private boolean on = false;
    int noOfShelfs=1;
    private static int noOfFridges=0;
    int [] shelfs = new  int[noOfShelfs];
    Fridge(){
        noOfFridges++;
    }
    Fridge(int noOfShelfs , double size , String color){
        noOfFridges++;
        this.color=color;
        this.size=size;
        this.noOfShelfs=noOfShelfs;
        shelfs = new  int[noOfShelfs];
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public boolean isOn() {
        return on;
    }
    public static int getNoOfFridges(){
        return noOfFridges;
    }
    public void addMeal(int shelfNumber , int numberOfMeals){
        if (shelfNumber<=(noOfShelfs-1)){
            shelfs[shelfNumber]+=numberOfMeals;
            System.out.println("Done!");
        }
        else
            System.out.println("Error");
    }
    public int getMeal(int shelfNumber){
        if(shelfNumber<=(noOfShelfs-1))
            return shelfs[shelfNumber];
        else
            return -1;
    }
}
