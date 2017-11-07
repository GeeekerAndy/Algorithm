package searching;

/**
 * Based on a sorted array.
 */
public class BinarySearch {
    public static boolean isExist(Integer[] array, int target) {

        //In case that I forget if the array is sorted.
        sorting.Quick.sort(array);

        int lo = 0;
        int hi = array.length - 1;

        while(lo <= hi) {
            int mid = (lo + hi)/2;
            int cmp = array[mid].compareTo(target);
            if(cmp > 0) {
                hi = mid - 1;
            } else if(cmp < 0) {
                lo = mid + 1;
            } else {
                return true;
            }
        }

        return false;
    }
}
