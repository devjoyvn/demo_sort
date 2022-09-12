public class InterchangeSort {
    public static <T extends Comparable<T>> void sort(T[] arr, int n) {
        for(int i = 0; i < n - 1; i++) {
            for(int j = i + 1; j < n; j++) {
                if (arr[i].compareTo(arr[j]) > 0) {
                    T tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
    }
}
