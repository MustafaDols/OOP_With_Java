package ch9;

public class Backpack {
    private String color;
    private double size;
    private int noOfPockets;
    private boolean on;
    private static int noOfBackpacks = 0;
    private int[] pockets;


    public Backpack() {
        this.color = "Black";
        this.size = 27.0;
        this.noOfPockets = 3;
        this.on = false;
        this.pockets = new int[noOfPockets];
        noOfBackpacks++;
    }


    public Backpack(String color, double size, int noOfPockets) {
        this.color = color;
        this.size = size;
        this.noOfPockets = noOfPockets;
        this.on = false;
        this.pockets = new int[noOfPockets];
        noOfBackpacks++;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public int getNoOfPockets() {
        return noOfPockets;
    }

    public void setNoOfPockets(int noOfPockets) {
        this.noOfPockets = noOfPockets;
        this.pockets = new int[noOfPockets];
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public static int getNoOfBackpacks() {
        return noOfBackpacks;
    }


    public void putElements(int pocketIndex, int numberOfElements) {
        if (pocketIndex >= 0 && pocketIndex < noOfPockets) {
            if (on) {
                pockets[pocketIndex] += numberOfElements;
                System.out.println("Done");
            } else {
                System.out.println("ch9.Backpack is off");
            }
        } else {
            System.out.println("Pocket index doesn't exist");
        }
    }


    public int getElements(int pocketIndex) {
        if (pocketIndex >= 0 && pocketIndex < noOfPockets) {
            return pockets[pocketIndex];
        } else {
            return -1;
        }
    }
}
