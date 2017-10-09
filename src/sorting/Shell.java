package sorting;

public class Shell {
    public static void sort(Comparable[] a) {
        int N = a.length;
        int h = 1;
        while(h < N) {
            h = 3*h + 1;
        }
        while(h >= 1) {

            for(int i = h; i < N; i++) {
                for(int j = i; j >= h && Tools.less(a[j], a[j - 1]); j -= h) {
                    Tools.exch(a, j, j - h);
                }
            }

            h = h/3;
        }
    }
}
