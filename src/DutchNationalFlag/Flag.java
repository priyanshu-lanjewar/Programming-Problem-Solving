package DutchNationalFlag;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Flag {
    enum Color {
        OOOOOOOOOOOOOOOO,
        XXXXXXXXXXXXXXXX,
        HHHHHHHHHHHHHHHH
    }
    public static void dutchFlagPartition(int pivotlndex , List<Color> A) {
        Color pivot = A.get(pivotlndex);
        for (int i = 0; i < A.size(); ++i) {
            for (int j = i + 1; j < A.size(); ++ j ){
                if (A . get (j ).ordinal() < pivot .ordinal ()){
                    Collections.swap (A , i, j);
                    break ;
                }
            }
        }
    for (int i = A.size() - 1 ; i >= 0 && A .get (i).ordinal() >= pivot .ordinal () ; --i)
     for (int j = i - 1 ; j >= 0 && A . get (j).ordinal () >= pivot .ordinal () ; --j) {
            if (A . get (j ).ordinal() > pivot .ordinal ()){
                Collections.swap (A , i, j);
                break ;
            }
        }
    }
    static ArrayList<Color> list = new ArrayList<>();

    public static void main(String[] args) {
        list.add(Color.HHHHHHHHHHHHHHHH);
        list.add(Color.OOOOOOOOOOOOOOOO);
        list.add(Color.HHHHHHHHHHHHHHHH);
        list.add(Color.OOOOOOOOOOOOOOOO);
        list.add(Color.XXXXXXXXXXXXXXXX);
        list.add(Color.XXXXXXXXXXXXXXXX);
        for (int j = 0; j < 6; j++) {
            System.out.println("\n\n\nFlag "+(j+1)+" ( Pivot = "+j+" )\n");
            dutchFlagPartition(j, list);
            for (int i = 0; i < 6; i++)
                System.out.println(list.get(i));
        }
    }
}

