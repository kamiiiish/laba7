import static org.junit.Assert.assertArrayEquals;

import org.example.ShellSort;
import org.junit.Test;

public class ShellSortTest {
    @Test
    public void testShellSort() {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        int[] sortedArr = {11, 12, 22, 25, 34, 64, 90};
        ShellSort.sort(arr);
        assertArrayEquals(sortedArr, arr);
    }

    @Test
    public void testEmptyArray() {
        int[] arr = {};
        int[] sortedArr = {};
        ShellSort.sort(arr);
        assertArrayEquals(sortedArr, arr);
    }

    @Test
    public void testAlreadySortedArray() {
        int[] arr = {1, 2, 3, 4, 5};
        int[] sortedArr = {1, 2, 3, 4, 5};
        ShellSort.sort(arr);
        assertArrayEquals(sortedArr, arr);
    }

    @Test
    public void testArrayWithNegativeNumbers() {
        int[] arr = {64, -34, 25, -12, 22, 11, -90};
        int[] sortedArr = {-90, -34, -12, 11, 22, 25, 64};
        ShellSort.sort(arr);
        assertArrayEquals(sortedArr, arr);
    }

    @Test
    public void testArrayWithMixedNumbers() {
        int[] arr = {-64, 34, -25, 12, -22, 11, 90};
        int[] sortedArr = {-64, -25, -22, 11, 12, 34, 90};
        ShellSort.sort(arr);
        assertArrayEquals(sortedArr, arr);
    }

    @Test
    public void testArrayWithSingleElement() {
        int[] arr = {5};
        int[] sortedArr = {5};
        ShellSort.sort(arr);
        assertArrayEquals(sortedArr, arr);
    }


}
