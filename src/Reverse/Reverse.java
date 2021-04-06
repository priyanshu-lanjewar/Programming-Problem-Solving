package Reverse;

import SwapBits.SwapingBits;

import java.util.Scanner;

public class Reverse {
    public static long reverseBits(long x) {
        final int W0RD_SIZE = 2;
        final int BIT_MASK = 0b11;
        return SwapingBits.swapBits(x & BIT_MASK,0,1) << (3 * W0RD_SIZE) |
                SwapingBits.swapBits((x >>> W0RD_SIZE) & BIT_MASK,0,1) << (2 * W0RD_SIZE) |
                SwapingBits.swapBits((x >>> (2*W0RD_SIZE)) & BIT_MASK,0,1) <<  W0RD_SIZE |
                SwapingBits.swapBits((x >>> (3*W0RD_SIZE)) & BIT_MASK,0,1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a  Number : ");
        int no = sc.nextInt();

        System.out.println("Inputted Number (BASE_10) :  "+ no);
        System.out.println("Number After Swaping (BASE_10) : "+ reverseBits(no));
        System.out.println("Inputted Number (BASE_2) :  "+ Long.toBinaryString(no));
        System.out.println("Number After Swaping (BASE_2) : "+ Long.toBinaryString(reverseBits(no)));
    }
}
