package ch13;

public class TestGeometricObject {
    public static void main(String[] args) {

        GeometricObject g1 = new Circle(1);
        GeometricObject g2 = new Rectangle(1,Math.PI);

        System.out.println("The Two Geometric objects have the same area ? " + equalArea(g1,g2));
        displayGeometricObject(g1);
        displayGeometricObject(g2);
    }
    public static boolean equalArea(GeometricObject g1 , GeometricObject g2){
        return g1.getArea()==g2.getArea();
    }
    public static void displayGeometricObject(GeometricObject object){
        System.out.println();
        System.out.println("The Area is " + object.getArea());
        System.out.println("The perimeter is " + object.getPerimeter());
    }
}
