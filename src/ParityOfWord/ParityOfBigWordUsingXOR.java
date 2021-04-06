package ParityOfWord;

import java.util.Scanner;

public class ParityOfBigWordUsingXOR {
    public static short parity ( long x){
        x ^= x >>> 32;
        x ^= x >>> 16;
        x ^= x >>> 8;
        x ^= x >>> 4;
        x ^= x >>> 2;
        x ^= x >>> 1;
        return (short) (x & 0x1);
    }

    public static void main(String[] args) {
        Scanner sc   =  new Scanner(System.in);
        System.out.println("Enter Number : ");
        long value = sc.nextLong();
        System.out.println("Parity Of Number "+value +" is : "+parity(value));
    }

}
