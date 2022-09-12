/*
 * The selection sort algorithm sorts an array by repeatedly finding the minimum
 * element(considering ascending order) from unsorted part and putting it at the beginning
 * O(n^2)
 */
public class SelectionSort
{
    public static<T extends Comparable<T>> void sort(T[] arr, int n)
    {
        for (int i = 0; i < n - 1; i++)
        {
            int index_min = i;
            for (int j = i + 1; j < n; j++)
            {
                /*
                 * Use codition arr[j] with a[index_min]
                 * Sort by ASC => Compare "<"
                 * Sort by DESC => Compare ">"
                 */
                if (arr[j].compareTo(arr[index_min]) < 0)
                {
                    index_min = j;
                }
            }
            T tmp = arr[index_min];
            arr[index_min] = arr[i];
            arr[i] = tmp;
        }
    }
}
