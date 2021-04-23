package Assignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class A01Q11 {

    public static long ClosestInt(long x) {

        final int NUM_UNSIGN_BITS=63;
        for (int i = 0; i < NUM_UNSIGN_BITS  - 1; ++i) {
            if ((((x >>> i) & 1) != ((x >>> (i + 1)) & 1))) {
                x ^= (1L << i) | (1L << (i + 1));
                return x;
            }
        }

        throw new IllegalArgumentException("All bits are ® or 1");
    }

    public static void main(String ...args) throws IOException {
        BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a number : ");
        long no = Long.parseLong(reader.readLine());
        System.out.println("Closest number Having Same Weight : "+ClosestInt(no));
    }
}
