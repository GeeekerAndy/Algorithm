package sorting;

import static sorting.Tools.exch;
import static sorting.Tools.less;

public class Selection {
    public static void sort(Comparable[] a) {
        for(int i = 0; i < a.length; i++) {
            int index = i;
            for(int j = i + 1; j < a.length; j++) {
                if(less(a[j], a[index])) {
                    index = j;
                }
            }
            exch(a, index, i);
        }
    }
}
