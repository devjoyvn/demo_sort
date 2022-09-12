public class BinarySearch {
    public static <T extends Comparable<T>> int search(T[] arr, T value) {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (arr[m].equals(value)) {
                return m;
            }
            if (arr[m].compareTo(value) < 0) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return -1;
    }
}
