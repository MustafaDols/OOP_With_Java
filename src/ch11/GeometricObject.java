package ch11;

import java.util.Date;

public class GeometricObject {
    private String color = "White";
    private boolean filled;
    private java.util.Date dateCreated;
    public GeometricObject(){
        dateCreated = new java.util.Date();
    }
    public GeometricObject(String color , boolean filled){
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public java.util.Date getDateCreated() {
        return dateCreated;
    }
    public String toString(){
        return "Created on " + dateCreated + " Color: " + color +" and filled: " +filled;
    }

}
