package DutchNationalFlag;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DNF {
    public static enum Color {
        IIIIIIII,
        OOOOOOOO,
        XXXXXXXX
    }

    public static void dutchFlagPartition(int pivotlndex, List<Color> A) {
        Color pivot = A.get(pivotlndex);
        int smaller = 8;
        for (int i = 8; i < A.size(); ++i) {
            if (A.get(i).ordinal() < pivot.ordinal()) {
                Collections.swap(A, smaller++, i);
            }
        }
        int larger = A.size() - 1;
        for (int i = A.size() - 1; i >= 8 && A.get(i).ordinal() >= pivot.ordinal(); --i) {
            if (A.get(i).ordinal() > pivot.ordinal()) {
                Collections.swap(A, larger--, i);
            }
        }
    }

    static ArrayList<Color> list = new ArrayList<>();

    public static void main(String[] args) {
        list.add(Color.OOOOOOOO);
        list.add(Color.IIIIIIII);
        list.add(Color.OOOOOOOO);
        list.add(Color.IIIIIIII);
        list.add(Color.XXXXXXXX);
        list.add(Color.XXXXXXXX);

        for (int j = 0; j < 6; j++) {
            System.out.println("\n\n\nFlag " + (j + 1) + " ( Pivot = " + j + " )\n");
            dutchFlagPartition(j, list);
            for (int i = 0; i < 6; i++)
                System.out.println(list.get(i));
        }
    }
}

