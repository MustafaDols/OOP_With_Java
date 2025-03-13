package ch9;

public class TestCooker {
    public static void main(String[]args){
        Cooker cooker1 = new Cooker();
        cooker1.turnOn(1);
        cooker1.turnOn(2);
        cooker1.cookerState();
        System.out.println("======================================================");
        Cooker cooker2 = new Cooker(90 ,18 , "Red");
        cooker2.turnOn(1);
        cooker2.turnOn(2);
        cooker2.turnOn(3);
        cooker2.cookerState();
        System.out.println("======================================================");
        cooker2.turnOf(3);
        cooker2.cookerState();
        System.out.println(Cooker.noOfCookers);

    }
}
