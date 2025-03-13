package ch9;

public class Cooker {
    private String color;
    private double length;
    private double width;
    static int noOfCookers=0;
    final int noOfRings=4;
    boolean Rings[] = new boolean[4];
    Cooker(){
        noOfCookers++;
        color="blue";
        length=30;
        width=20;
        Rings= new boolean[4];
    }
    Cooker(double length,double width,String color){
        noOfCookers++;
        this.color=color;
        this.length=length;
        this.width=width;
    }
    public void setColor(String color){
        this.color=color;
    }

    public String getColor() {
        return color;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }
    public void turnOn(int ringindex){
        if(ringindex<4)
            Rings[ringindex]=true;
        else
            System.out.println("Error");
    }
    public void turnOf(int ringindex){
        if(ringindex<4)
            Rings[ringindex]=false;
        else
            System.out.println("Error");
    }
    public void cookerState(){
        for (int i=0 ; i< Rings.length ; i++)
            System.out.println(Rings[i]);
    }
}