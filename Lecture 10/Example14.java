import java.io.*;
import java.util.Scanner;

public class Example14 {
    public static void main(String[] args) {
        int rateOfInterest;
        int principalAmount;
        int numberOfYears ;
        Scanner in =new Scanner(System.in);
        try{
            System.out.println("Enter the Principal Amount ");
            principalAmount = in.nextInt();
            System.out.println("Enter Rate of interest ");
            rateOfInterest = in.nextInt();
            System.out.println("Enter Number of years");
            numberOfYears = in.nextInt();
            float interestTotal = principalAmount*rateOfInterest*numberOfYears;
            System.out.println("Total interest = " + interestTotal);
        }
        catch(Exception ex)
        {}
    }
}
