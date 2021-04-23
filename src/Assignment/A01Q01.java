
package Assignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A01Q01 {
    public static Short countBits(Integer x) {
        short numBits = 0;
        while (x != 0) {
            numBits += (x & 1);
            x >>>= 1;
        }
        return numBits;
    }

    public static void main(String... args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter an Integer : ");
        Integer number = Integer.parseInt(reader.readLine());
        System.out.println("Number of Set Bits : " + countBits(number));
    }
}
