package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest {

    @Test
    public void whenArrayHasLengh3Then2() {
        FindLoop find = new FindLoop();
        int[] input = new int[]{5, 23, 3};
        int value = 3;
        int result = find.indexOf(input, value);
        int expect = 2;
        assertThat(result, is(expect));
    }
    @Test
    public void whenArrayHasLengh8ThenError() {
        FindLoop find = new FindLoop();
        int[] input = new int[]{7, 19, 2};
        int value =8;
        int result = find.indexOf(input, value);
        int expect = -1;
        assertThat(result, is(expect));
    }
    @Test
    public void whenArrayHasLengh25Then0() {
        FindLoop find = new FindLoop();
        int[] input = new int[]{25, 44, 17};
        int value = 25;
        int result = find.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }
    @Test
    public void whenArrayHasLengh19Then1() {
        FindLoop find = new FindLoop();
        int[] input = new int[]{6, 19, 17};
        int value = 19;
        int result = find.indexOf(input, value);
        int expect = 1;
        assertThat(result, is(expect));
    }
}