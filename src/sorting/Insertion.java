package sorting;

import static sorting.Tools.exch;
import static sorting.Tools.less;

public class Insertion {
    public static void sort(Comparable[] a) {
        for(int i = 1; i < a.length; i++) {
            for(int j = i; j > 0; j--) {
                if(less(a[j], a[j - 1])) {
                    exch(a, j, j - 1);
                }
            }
        }
    }
}
