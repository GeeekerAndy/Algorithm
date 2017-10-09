package sorting;

public class Heap {

    //因二叉堆没有用到a[0]元素，故想让堆排序像普通排序那样使用，
    // 要注意传递给Tools.less()、Tools.exch()中元素的下标 -1.

    public static void sort(Comparable[] a) {
        int N = a.length;
        //构造堆
        for(int i = N/2; i >= 1; i--) {
            sink(a, i, N);
        }
        //堆排序
        while(N > 1) {
            Tools.exch(a, 1 - 1, N - 1);
            N--;
            sink(a, 1, N);
        }
    }


    private static void sink(Comparable[] a, int k, int N) {
        while(2*k <= N) {
            int j = 2*k;
            if(j < N && Tools.less(a[j - 1], a[j + 1 - 1])) {
                j++;
            }
            if(!Tools.less(a[k - 1], a[j - 1])) {
                break;
            }
            Tools.exch(a, j - 1, k - 1);
            k = j;
        }
    }
}
