package ch10;

public class StringClass {
    public static void main(String[] args) {
        String s1 = "Mustafa";
        String s2 = new String(" Mahmoud");
        String s3 = s1.concat(s2);
        System.out.println(s3);
        System.out.println(s3.length());
        System.out.println(s3.charAt(8));
        System.out.println(s3.substring(8));
        System.out.println(s3.substring(0,7));

        String ss1 = "ABCD";
        String ss2 = "ABCD";
        String ss3 = new String("ABCD");
        System.out.println(ss1==ss2);
        System.out.println(ss1==ss3);
        System.out.println(ss1.equals(ss2));
        System.out.println(ss1.equals(ss3));
        ss3.intern();
        System.out.println(ss1==ss3);

        String sss1 = "XYZXYZ";
        String sss2 = "XYZ";
        System.out.println(sss1.compareTo(sss2)); // 6-3
        System.out.println(sss2.compareTo(sss1)); // 3-6

        System.out.println("java".matches("java"));
        System.out.println("java".equals("java"));

        System.out.println("java c++".matches("java"));
        System.out.println("java c++".equals("java"));

        System.out.println("java c++".matches("java.*"));

        System.out.println("1#2@3$4%5&6".replaceAll("[#@$%&*]",","));
        String x =String.valueOf(5.55);
        System.out.println(x);


    }
}
