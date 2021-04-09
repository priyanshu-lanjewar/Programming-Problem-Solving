package ParityOfWord;

import java.util.Scanner;

public class ParityOFBigWordUsingLookUpTable {
    public static short parity(long x) {
        final int W0RD_SIZE = 2;
        final int BIT_MASK = 0b11 ;
        return (short) (
                LookupTable((int) ((x >>> (3 * W0RD_SIZE)) & BIT_MASK))
        ^ LookupTable((int)((x >>> (2 * W0RD_SIZE)) & BIT_MASK))
        ^ LookupTable((int)((x >>> W0RD_SIZE) & BIT_MASK))
        ^ LookupTable((int)(x & BIT_MASK)));
    }

    public static short LookupTable(int val){
        return switch (val) {
            case 0b01, 0b10 -> (short)1;
            default -> (short)0;
        };
    }

    public static void main(String[] args) {
        Scanner sc   =  new Scanner(System.in);
        System.out.println("Enter Number : ");
        long value = sc.nextLong();
        System.out.println("Parity Of Number "+value +" is : "+parity(value));
    }

}
