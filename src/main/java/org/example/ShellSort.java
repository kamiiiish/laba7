package org.example;

public class ShellSort {
    public static void sort(int array[])
    {
        int n = array.length;


// Start with a maximum gap, then reduce it
        for (int gap = n/2; gap > 0; gap /= 2)
        {
// Apply insertion sort to the current gap size.
            for (int i = gap; i < n; i += 1)
            {
                int temp = array[i];


// shift earlier sorted elements until
// the correct position for a[i] is found
                int j;
                for (j = i; j >= gap && array[j - gap] > temp; j -= gap)
                {
                    array[j] = array[j - gap];
                }


// put the original a[i] stored in temp in its correct position
                array[j] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        sort(arr);
        System.out.println("Отсортированный массив:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
