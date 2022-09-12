/*
 *
 * ShellSort is mainly a variation of Insertion Sort. In insertion sort,
 * we move elements only one position ahead. When an element has to be moved
 * far ahead, many movements are involved. The idea of shellSort is to allow
 * exchange of far items. In shellSort, we make the array h-sorted for a large
 * value of h. We keep reducing the value of h until it becomes 1. An array
 * is said to be h-sorted if all sublists of every h’th element is sorted.
 * O(n^2)
 */

public class ShellSort {
    public static<T extends Comparable<T>> void sort(T[] arr, int n)
    {
        for (int gap = n / 2; gap > 0; gap /= 2)
        {
            for (int i = gap; i < n; i += 1)
            {
                T temp = arr[i];

                int j;
                /*
                 * use codition for arr[j - gap] with temp
                 * Sort by ASC => Compare ">"
                 * Sort by DESC => Compare "<"
                 */
                for (j = i; j >= gap && arr[j - gap].compareTo(temp) > 0; j -= gap)
                    arr[j] = arr[j - gap];

                arr[j] = temp;
            }
        }
    }

}