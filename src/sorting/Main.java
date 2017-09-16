package sorting;

public class Main {
    public static void main(String[] args) {
        Integer[] array = {0, 1, 3, 3, 33333, 445, -1, -1, 0, 0};
        bubbleSort(array);
        System.out.println(isSorted(array));
        show(array);

    }

    /**
     * 快速排序
     */
    public static void quickSort(Comparable[] a, int lo, int hi) {
        if(lo >= hi) {
            return;
        }
        int j = partition(a, lo, hi);
        quickSort(a, lo, j - 1);
        quickSort(a, j + 1, hi);
    }

    private static int partition(Comparable[] a, int lo, int hi) {
        int i = lo;
        int j = hi + 1;
        while(true) {
            while(less(a[++i], a[lo])) {
                if(i == hi) {
                    break;
                }
            }
            while(less(a[lo], a[--j])) {
                if(i == lo) {
                    break;
                }
            }
            if(i >= j) {
                break;
            }
            exch(a, i, j);
        }
        exch(a, lo, j);
        return j;
    }

    /**
     * 插入排序
     */
    public static void insertionSort(Comparable[] a) {
        for(int i = 1; i < a.length; i++) {
            for(int j = i; j > 0; j--) {
                if(less(a[j], a[j - 1])) {
                    exch(a, j, j - 1);
                }
            }
        }
    }

    /**
     * 选择排序
     */
    public static void selectionSorting(Comparable[] a) {
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

    /**
     * 冒泡排序
     */
    public static void bubbleSort(Comparable[] a) {
        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < a.length - 1; j++) {
                if(less(a[j + 1], a[j])) {
                    exch(a, j, j + 1);
                }
            }
        }
    }

    /**
     * 辅助方法
     */

    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    private static void exch(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    private static void show(Comparable[] a) {
        for(int i  = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    private static boolean isSorted(Comparable[] a) {
        for(int i = 1; i < a.length; i++) {
            if(less(a[i], a[i - 1]))
                return false;
        }
        return true;
    }
}
























