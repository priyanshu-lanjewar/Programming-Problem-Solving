package Assignment;

public class A01Q05 {
    public static short LookupTable(int x) {
        x ^= x >>> 16;
        x ^= x >>> 8;
        x ^= x >>> 4;
        x ^= x >>> 2;
        x ^= x >>> 1;
        return (short) (x & 0x1);
    }

    public static void main(String ...args) {
        System.out.println("Look Up Table");
        System.out.println("|---------|--------------------|-----|");
        System.out.println("| INTEGER | BINARY  EQUIVALENT |  P  |");
        System.out.println("|---------|--------------------|-----|");
        for(int i=0;i<Math.pow(2.0,8.0);i++){
            String op ="|  ";
            String no = ""+ i;
            while (no.length()!=5) no = "0"+no;
            op = op+no+"  |";
            String  bin = Integer.toBinaryString(i);
            while (bin.length()!=16) bin="0"+bin;
            op = op+"  "+ bin +"  |";
            String LookUpValue = ""+LookupTable(i);
            op=op+"  "+LookUpValue+"  |";
            System.out.println(op);
        }
        System.out.println("|---------|--------------------|-----|");
    }
}