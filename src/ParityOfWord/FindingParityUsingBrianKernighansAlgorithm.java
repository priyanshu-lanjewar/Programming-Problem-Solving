package ParityOfWord;

import java.util.Scanner;

public class FindingParityUsingBrianKernighansAlgorithm {
    public static short parity(long x) {
        short result = 0;
        while (x != 0) {
            result ^= 1;
            x &= (x - 1);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = scanner.nextInt();

        System.out.println("Parity = " + parity(number));
    }
}


