package ch11;

public class TestGeometricObject {
    public static void main(String[] args) {

        Circle circle = new Circle(1);
        System.out.println("A circle " + circle.toString());
        System.out.println("The color is " + circle.getColor());
        System.out.println("The radius is " + circle.getRadius());
        System.out.println("The area is " + circle.getArea());
        System.out.println("The diameter is " + circle.getDiameter());

        Rectangle rectangle = new Rectangle(2,4);
        System.out.println("A rectangle is " + rectangle.toString());
        System.out.println("The area is " + rectangle.getArea());
        System.out.println("The perimeter is " + rectangle.getPerimeter());

        displayObject(new Circle(1,"red",false));
        displayObject(new Rectangle(1,1,"black",true));

    }
    public static void displayObject(GeometricObject object){
        System.out.println("created on "+object.getDateCreated() + ". color is " + object.getColor());
    }
}
