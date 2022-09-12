//Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements if they are in wrong order.
// O(n^2)

public class BubbleSort {
    public static <T extends Comparable<T>> void sort(T[] arr, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                /*
                 * Use codition arr[j] with a[j + 1]
                 * Sort by ASC => Compare ">"
                 * Sort by DESC => Compare "<"
                 */

                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    T tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }

}
