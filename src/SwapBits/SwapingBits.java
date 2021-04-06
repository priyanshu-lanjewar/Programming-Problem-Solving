package SwapBits;

import java.util.Scanner;

public class SwapingBits {
    public static long swapBits(long x, int i, int j) {
        if (((x >>> i) & 1) != ((x >>> j) & 1)) {
            long bitMask = (1L << i) | (1L << j);
            x ^= bitMask;
        }
        return x;
    }

    public static void main(String[] args) {
        System.out.println(0b0011 >>2);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a  Number : ");
        long no = sc.nextLong();
        System.out.print("Enter i and j value below \n i => ");
        int i = sc.nextInt();
        System.out.print(" j => ");
        int j = sc.nextInt();
        System.out.println("Inputted Number (BASE_10) :  "+ no);
        System.out.println("Number After Swaping (BASE_10) : "+ swapBits(no,i,j));
        System.out.println("Inputted Number (BASE_2) :  "+ Long.toBinaryString(no));
        System.out.println("Number After Swaping (BASE_2) : "+ Long.toBinaryString(swapBits(no,i,j)));
    }
}
