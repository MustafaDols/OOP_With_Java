package ch11;

public class TestOverLoadingAndOverRiding {
    public static void main(String[] args) {
        A1 a = new A1();
        a.p(10);
        a.p(10.0);

        A2 a2 = new A2();
        a2.p(10);
        a2.p(10.0);

    }
}
     class B1{
        public void p(double i){
            System.out.println(i * 2);
        }
    }

     class A1 extends B1{
         @Override
        public void p(double i){
            System.out.println(i);
        }
    }


    class B2{
    public void p(double i){
        System.out.println(i * 2);
    }

    }
    class A2 extends B2{
    //overloading
        public void p(int i){
            System.out.println(i);
        }
    }
