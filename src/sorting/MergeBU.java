package sorting;

import static sorting.Tools.less;

public class MergeBU {

    private static Comparable[] aux;

    public static void sort(Comparable[] a) {

        int N = a.length;
        aux = new Comparable[N];

        for(int i = 0; i < N; i++) {
            aux[i] = a[i];
        }
        for(int sz = 1; sz < N; sz = sz*2) {
            for(int lo = 0; lo < N - sz; lo += sz*2) {
                merge(a, lo, lo + sz - 1, min((lo + sz + sz - 1), N - 1));
            }
        }
    }

    private static int min(int a, int b) {
        return a < b ? a : b;
    }

    private static void merge(Comparable[] a, int lo, int mid, int hi) {
        int i = lo;
        int j = mid + 1;
        for(int k = lo; k <= hi; k++) {
            aux[k] = a[k];
        }
        for(int k = lo; k <= hi; k++) {
            if(i > mid) {
                a[k] = aux[j++];
            } else if(j > hi) {
                a[k] = aux[i++];
            } else if(less(aux[i], aux[j])) {
                a[k] = aux[i++];
            } else {
                a[k] = aux[j++];
            }
        }
    }

}
