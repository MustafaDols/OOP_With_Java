package ch12;

public class CircleWithRadiusException {
    private double radius;
    private static int numberOfObjects=0;
    public CircleWithRadiusException(){
        this(1.0);
    }
    public CircleWithRadiusException(double newRadius) {
        try {
            setRadius(newRadius);
            numberOfObjects++;
        }
        catch (InvalidRadiusException ex){
            ex.printStackTrace();
        }

    }
    public double getRadius() {
        return radius;
    }

    public void setRadius(double newRadius) throws InvalidRadiusException{
        if (newRadius>=0)
            radius = newRadius;
        else
            throw new InvalidRadiusException(newRadius);
    }

    public static int getNumberOfObjects() {
        return numberOfObjects;
    }
}
