package ch10;

import ch10.Integer2;

public class TestImmutable {
    public static void main(String[] args) {
        int  x = 1;
        int  y = 2;
        System.out.println(x+","+y);

        swap(x,y);

        System.out.println(x+","+y);
        Integer x2 = new Integer("1");
        Integer y2 = new Integer("2");

        System.out.println(x2+","+y2);
        swap2(x2,y2);
        System.out.println(x2+","+y2);

        Integer2 x3 =new Integer2(1);
        Integer2 y3 =new Integer2(2);
        System.out.println(x3.value+","+y3.value);
        swap3(x3,y3);
        System.out.println(x3.value+","+y3.value);

    }
    public static void swap(int x , int y){
        int temp;
        temp= x;
        x=y;
        y=temp;
    }
    public static void swap2(Integer x , Integer y){
        Integer temp;
        temp= x;
        x=y;
        y=temp;
    }
    public static void swap3(Integer2 x , Integer2 y){
        int temp;
        temp= x.value;
        x.value=y.value;
        y.value=temp;
    }

}
