package Assignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A01Q14 {
    public static double power (double x, int y) {
        double result = 1.0;
        long power = y;
        if (y < 0) {
            power = -power;
            x = 1.0 / x ;
        }
        while (power != 0) {
            if ((power & 1) != 0) {
                result *= x;
            }
            x *= x ;
            power >>>= 1 ;
        }
        return result ;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter Value of X and Y : ");
        System.out.println("X power Y : "+power(Double.parseDouble(reader.readLine()),Integer.parseInt(reader.readLine())));
    }
}
