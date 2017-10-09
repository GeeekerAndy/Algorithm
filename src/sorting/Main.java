package sorting;

import static sorting.Tools.*;

public class Main {
    public static void main(String[] args) {
        Integer[] array = {0, 1, 3, 3, 33333, 445, -1, -1, 0, 0};
//        Bubble.sort(array);
//        Insertion.sort(array);
//        Quick.sort(array);
//        Selection.sort(array);
//        MergeBU.sort(array);
//        Shell.sort(array);
        Heap.sort(array);
        System.out.println(isSorted(array));
        show(array);
    }
}
























