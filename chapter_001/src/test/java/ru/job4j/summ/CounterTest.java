package ru.job4j.summ;

import org.junit.Test;

import javax.xml.ws.soap.Addressing;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CounterTest {
    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        Counter count = new Counter();
        int sum = count.add(1, 10);
        assertThat(sum, is(30));
    }
}