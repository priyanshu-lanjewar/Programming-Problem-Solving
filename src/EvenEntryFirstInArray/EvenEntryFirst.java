package EvenEntryFirstInArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class EvenEntryFirst {
    public static void evenOdd(int[] A) {
        int nextEven = 0, nextOdd = A.length - 1;
        while (nextEven < nextOdd) {
            if (A[nextEven] % 2 == 00) {
                nextEven++;
            } else {
                int temp = A[nextEven];
                A[nextEven] = A[nextOdd];
                A[nextOdd--] = temp;
            }
        }
    }

    static int array[];
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter Size Of Array : " );
        int size =Integer.parseInt(reader.readLine());
        array = new int[size];
        for (int i=0;i<size;i++){
            System.out.print("Enter Element At Index : "+i+" : ");
            array[i]=Integer.parseInt(reader.readLine());
        }
        System.out.println("Inputted Array : "+display(array));
        evenOdd(array);
        System.out.println("Rearranged Array With Even Entry First : "+display(array));
    }
    public static String display(int[] arr){
        String op=" [";
        for (int i=0;i<arr.length;i++){
            op+=" "+arr[i]+" ";
        }
        op+="]";
        return op;
    }

}

