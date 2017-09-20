package sorting;

import static sorting.Tools.exch;
import static sorting.Tools.less;

public class Bubble {
    public static void sort(Comparable[] a) {
        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < a.length - 1; j++) {
                if(less(a[j + 1], a[j])) {
                    exch(a, j, j + 1);
                }
            }
        }
    }
}
