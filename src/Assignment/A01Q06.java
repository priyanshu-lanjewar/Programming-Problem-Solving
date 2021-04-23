package Assignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A01Q06
{
    public static short parity(long x) {
        final int W0RD_SIZE = 16;
        final int BIT_MASK = 0b11111111 ;
        return (short) (
                LookupTable((int) ((x >>> (3 * W0RD_SIZE)) & BIT_MASK))
                        ^ LookupTable((int)((x >>> (2 * W0RD_SIZE)) & BIT_MASK))
                        ^ LookupTable((int)((x >>> W0RD_SIZE) & BIT_MASK))
                        ^ LookupTable((int)(x & BIT_MASK)));
    }
    public static short LookupTable(long x) {
        x ^= x >>> 32;
        x ^= x >>> 16;
        x ^= x >>> 8;
        x ^= x >>> 4;
        x ^= x >>> 2;
        x ^= x >>> 1;
        return (short) (x & 0x1);
    }

    public static void main(String ...args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number : ");
        int number = Integer.parseInt(reader.readLine());
        System.out.println("Parity = " + parity(number));
    }
}
