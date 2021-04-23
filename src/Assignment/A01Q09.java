package Assignment;


import java.io.IOException;
import java.util.ArrayList;

public class A01Q09 {
    public static  ArrayList<String> Table = new ArrayList<>(65536);
    public static Integer[] LookUpTable = new Integer[65536];
    public static void GenerateLookUpTable() {
        for (int i = 0; i < 65536; i++) {
            StringBuilder bin = new StringBuilder(Integer.toBinaryString(i));
            while (bin.length() != 16) bin.insert(0, "0");
            LookUpTable[i] = Integer.parseInt(new StringBuffer(bin.toString()).reverse().toString(),2);
            Table.add(i, new StringBuffer(bin.toString()).reverse().toString());
        }
    }


    public static void main(String ...args) throws IOException {
        GenerateLookUpTable();
        for(int i = 0;i<=35536;i++){
            System.out.println(i + " => " +Table.get(i));
        }

    }
}
