package ru.job4j.max;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenFirstLessSecond() {
        Max maxim = new Max();
        int result = maxim.max(1, 2);
        assertThat(result, is(2));
    }
    @Test
    public void whenSecondLessFirst() {
        Max maxim = new Max();
        int result = maxim.max(2, 1);
        assertThat(result, is(2));
    }
    @Test
    public void whenThirdLessSecondLessFirst() {
        Max maximum = new Max();
        int result = maximum.max(3, 2, 1);
        assertThat(result, is(3));
    }
    @Test
    public void whenSecondLessThirdLessFirst() {
        Max maximum = new Max();
        int result = maximum.max(2, 3, 1);
        assertThat(result, is(3));
    }
    @Test
    public void whenFirstLessTherdLessSecond() {
        Max maximum = new Max();
        int result = maximum.max(1, 3, 2);
        assertThat(result, is(3));
    }
}