package Assignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A01Q10 extends A01Q09 {

    public static String reverseBits(long x) {

        final int WORD_SIZE = 16;
        final int BIT_MASK = 0xffff;
        return Long.toBinaryString((long) LookUpTable[(int) (x & BIT_MASK)] << (3 * WORD_SIZE)
                | (long) LookUpTable[(int) ((x >>> WORD_SIZE) & BIT_MASK)] << (2 * WORD_SIZE)
                | (long) LookUpTable[(int) ((x >>> (2 * WORD_SIZE)) & BIT_MASK)] << WORD_SIZE
                | LookUpTable[(int) ((x >>> (3 * WORD_SIZE)) & BIT_MASK)]);
    }

    public static void main(String ...args) throws IOException {
        GenerateLookUpTable();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a Number : ");
        Long number = Long.parseLong(reader.readLine());
        System.out.println("Binary Equivalent : "+Long.toBinaryString(number));
        String op = reverseBits(number);
        System.out.println("Reversed String  64 bit : "+op);

    }
}
