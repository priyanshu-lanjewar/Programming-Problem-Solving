package SameWeightClosestNumber;

import java.util.Scanner;

public class SameWeight
{
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

    public static void main(String ...args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        long no = sc.nextLong();
        System.out.println("Closest number Having Same Weight : "+ClosestInt(no));
    }
}
