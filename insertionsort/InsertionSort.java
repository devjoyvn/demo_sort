/*
 * Insertion sort is a simple sorting algorithm that works the way we sort playing cards in our hands.
 * O(n^2)
 */

public class InsertionSort {

    public static <T extends Comparable<T>> void sort(T[] arr, int n) {
        for (int i = 1; i < n; ++i) {
            T key = arr[i];
            int j = i - 1;

            // Move elements of arr[0..i-1],
            // that are greater than key,
            // to one position ahead of
            // their current position
            /*
             * Use codition arr[j] with pivot
             * Sort by ASC => Compare ">"
             * Sort by DESC => Compare "<"
             */
            while (j >= 0 && arr[j].compareTo(key) < 0) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }


    }

}
