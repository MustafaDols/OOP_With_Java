package Final_Rev;

import java.util.ArrayList;

public class A {
    public static void main(String[] args) {
        X a = new Y();
        System.out.println(a.i);
        a.display();
    }
}
class X{
    int i = 10;
    void display(){
        System.out.println("IM X");
    }
}
class Y extends X{
    int i = 20;
    void display(){
        System.out.println("IM Y");
    }
}