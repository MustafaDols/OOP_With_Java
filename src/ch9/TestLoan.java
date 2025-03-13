package ch9;

import ch9.Loan;

import java.util.Scanner;

public class TestLoan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Yearly Interest Rate , for Example 8.25: ");
        double annualInterestRate = input.nextDouble();

        System.out.println("Enter number of years as an Integer: ");
        int numberOfYears = input.nextInt();

        System.out.println("Enter ch9.Loan Amount ,for Example ,120000.25 : ");
        double LoanAmount = input.nextDouble();

        Loan loan = new Loan(annualInterestRate,numberOfYears,LoanAmount);

        System.out.println("The ch9.Loan was created on " + loan.getLoanDate().toString());
        System.out.println("The Monthly Payment is : " + loan.getMonthlyPayment());
        System.out.println("The total Payment is : " + loan.getTotalPayment());

    }

}
