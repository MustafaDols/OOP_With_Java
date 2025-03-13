package Final_Rev;

public class Test1 {
    public static void main(String[] args) {
        String s= "University" ;
        s.replace( "i" , "ABC" );
        System.out.println(s);

        StringBuilder s2 = new StringBuilder("University");
        s2.replace(0,9,"i");
        System.out.println(s2);

        String[] tokens= "Welcome to Java".split( "o" );
        for (int i=0 ; i < tokens.length; i++) {
            System.out.print(tokens[i] + " " );
        }

    }
}
