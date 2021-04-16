package RandomNumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RandomNumber {
    public static int uniformRandom(int lowerBound, int upperBound) {
        int numberOfOutcomes = upperBound - lowerBound + 1, result;
        do {
            result = 0;
            for (int i = 0; (1 << i) < numberOfOutcomes; ++i) {

                result = (result << 1) | zeroOneRandom();
            }

        } while (result >= numberOfOutcomes);
        return result + lowerBound;

    }

    private static int zeroOneRandom() {
        return (int) (2*Math.random());
    }

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter Lower Bound : LB = ");
        int lb = Integer.parseInt(reader.readLine());
        System.out.print("Enter Upper Bound : UB = ");
        int ub = Integer.parseInt(reader.readLine());
        for (int i=lb;i<=ub;i++){
            System.out.println("Random Number : " + uniformRandom(lb, ub));
        }
    }
}
