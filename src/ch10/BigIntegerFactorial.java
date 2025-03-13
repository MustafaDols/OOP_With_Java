package ch10;

import java.math.BigInteger;

public class BigIntegerFactorial {
        public static void main(String[] args) {
            System.out.println(fac(5));
            System.out.println(fac2(5));
            System.out.println(factorial(5));

        }

        public static BigInteger factorial(long n) {
            BigInteger result = new BigInteger("1");
            for (int i = 1; i <= n; i++)
                result = result.multiply(new BigInteger(i +""));
            return result;
        }
        public static int fac(int n){
            if (n==0||n==1)
                return 1;
            else
                return n * fac(n-1);
        }
        public static int fac2(int n) {
            int result =1;
            for (int i = 1; i <= n; i++)
                result *= i;
            return result;
        }


    }

