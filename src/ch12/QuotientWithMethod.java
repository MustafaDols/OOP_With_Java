package ch12;

import java.util.Scanner;

public class QuotientWithMethod {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter two integers ");
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int result = quotient(n1,n2);
        System.out.println(n1 + "/" + n2 +" = " + result);
    }
    public static int quotient(int num1 , int num2){
        if(num2==0){
            System.out.println(" Divisor cannot by zero ");
            System.exit(0);
        }

            return num1/num2;
    }
}
