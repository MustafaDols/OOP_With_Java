package ch12;

import java.util.Scanner;

public class QuotientWithException {
    public static void main(String[] args) {

            Scanner in = new Scanner(System.in);
            System.out.println("Enter two integers ");
            int n1 = in.nextInt();
            int n2 = in.nextInt();

            try {
                int result = quotient(n1,n2);
                System.out.println(n1 + "/" + n2 +" = " + result);
            }
            catch (ArithmeticException ex){
                System.out.println("Exception: an Integer " + "cannot be divided by zero");
            }

        System.out.println("Execution continues . . . ");
        }

    public static int quotient(int num1 , int num2){
        if(num2==0){
            throw new ArithmeticException(" Divisor cannot by zero ");
        }

        return num1/num2;
    }
    }