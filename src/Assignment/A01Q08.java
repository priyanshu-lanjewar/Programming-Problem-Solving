package Assignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A01Q08 {
    public static long swapBits(long x, int i, int j) {
        if (((x >>> i) & 1) != ((x >>> j) & 1)) {
            long bitMask = (1L << i) | (1L << j);
            x ^= bitMask;
        }
        return x;
    }

    public static void main(String ...args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a  Number : ");
        Long no = Long.parseLong(reader.readLine());
        System.out.print("Enter i and j value below \n i => ");
        Integer i = Integer.parseInt(reader.readLine());
        System.out.print(" j => ");
        Integer j = Integer.parseInt(reader.readLine());
        System.out.println("Inputted Number (BASE_10) :  "+ no);
        System.out.println("Number After Swaping (BASE_10) : "+ swapBits(no,i,j));
        System.out.println("Inputted Number (BASE_2) :  "+ Long.toBinaryString(no));
        System.out.println("Number After Swaping (BASE_2) : "+ Long.toBinaryString(swapBits(no,i,j)));
    }
}
