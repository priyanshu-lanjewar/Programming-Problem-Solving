package Assignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A01Q13 {
    public static long divide(long x, long y) {
        long result = 0;
        int power = 32;
        long yPower = y << power;
        while (x >= y) {
            while (yPower > x) {
                yPower >>>= 1;
                --power;
            }

            result += 1L << power;
            x -= yPower;
        }

        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter X : ");
        long X = Long.parseLong(reader.readLine());
        System.out.print("Enter Y : ");
        long Y = Long.parseLong(reader.readLine());
        System.out.println("Value Of X/Y : " + divide(X, Y));
    }
}
