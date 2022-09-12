/*
 * QuickSort is a Divide and Conquer algorithm.It picks an element as pivot
 * and partitions the given array around the picked pivot.There are many
 * different versions of quickSort that pick pivot in different ways.
 * public class QuickSort
 * best case: O(Nlog2N)
 * bad case: O(n^2)
 * medium case: O(Nlogn)
 */


public class Quicksort {

    public static <T extends Comparable<T>> void sort(T[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            sort(arr, low, pi - 1);
            sort(arr, pi + 1, high);
        }
    }

    public static <T extends Comparable<T>> int partition(T[] arr, int low, int high) {
        T pivot = arr[high];

        int i = low - 1;
        for (int index = low; index < high; index++) {
            /*
             * Use codition arr[j] with pivot
             * Sort by ASC => Compare "<="
             * Sort by DESC => Compare ">="
             */
            if (arr[index].compareTo(pivot) <= 0) {
                i++;
                T temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
            }
        }

        T temp1 = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp1;
        return i + 1;
    }
}