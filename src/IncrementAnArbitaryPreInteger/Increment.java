package IncrementAnArbitaryPreInteger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Increment {
    public static List<Integer> plusOne(List<Integer> A) {
        int n = A.size() - 1;
        A.set(n, A.get(n) + 1);
        for (int i = n; i > 0 && A.get(i) == 10; --i) {
            A.set(i, 0);
            A.set(i - 1, A.get(i - 1) + 1);
        }
        if (A.get(0) == 10) {
            A.set(0, 0);
            A.add(0, 1);
        }
        return A;
    }
    public static ArrayList<Integer> list =new ArrayList<>();
    public static void main(String ...args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter Size OF Array : ");
        Integer size = Integer.parseInt(reader.readLine());

        while (size--!=0){
            System.out.print("Enter Element ");
            list.add(Integer.parseInt(reader.readLine()));
        }
        System.out.println(plusOne(list));
    }
}
