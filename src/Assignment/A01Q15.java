package Assignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A01Q15 {
    public static boolean isPalindromeNumber (int x) {
        if (x < 0) {
            return false;
        }
        final int numDigits = (int) (Math.floor(Math.log10(x))) + 1;
        int msdMask = (int) Math.pow(10, numDigits - 1);
        for (int i = 0; i < (numDigits / 2); ++i) {
            if (x / msdMask != x % 10) {
                return false;
            }
            x %= msdMask;
            x /= 10;
            msdMask /= 100;
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter A Number : ");
        System.out.println("Inputted Number is Palindrome : " + isPalindromeNumber(Integer.parseInt(reader.readLine())));
        reader.close();
    }
}
