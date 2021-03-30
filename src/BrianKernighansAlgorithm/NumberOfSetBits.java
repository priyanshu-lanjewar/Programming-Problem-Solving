package BrianKernighansAlgorithm;

import java.util.Scanner;

public class NumberOfSetBits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = scanner.nextInt();
        int setBits=0;
        while (number!=0){
            setBits = setBits + (number&1);
            number= number >>>1;
        }
        System.out.println("Number of SetBits : "+setBits);
        scanner.close();
    }

}
