package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BubbleSortTest {
    @Test
    public void whenSortArrayWithTenElementsThenSortedArray() {
        BubbleSort sort = new BubbleSort();
        int[] input = new int[] {4, 1, 6, 2};
        int[] result = sort.bubble(input);
        int[] expect = new int[] {1, 2, 4, 6};
        assertThat(result, is(expect));
    }
    @Test
    public void whenSortArrayWithTenElementsThenSortedArray1() {
        BubbleSort sort = new BubbleSort();
        int[] input = new int[] {2, 12, 3, 1, 7, 8, 14, 4};
        int[] result = sort.bubble(input);
        int[] expect = new int[] {1, 2, 3, 4, 7, 8, 12, 14};
        assertThat(result, is(expect));
    }
}